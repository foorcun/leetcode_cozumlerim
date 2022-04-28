package com.example.leetcode_cozumlerim.Backtracking.N_Queens51;

import java.util.*;

public class Deneme4Nver2 {
    ParamsVer2 p = new ParamsVer2();
    Set<Integer> colSet = new HashSet();
    Set<Integer> posDiag = new HashSet(); // row + col
    Set<Integer> negDiag = new HashSet(); // row - col

    List<List<String>> result = new ArrayList<>();
    public  void doIt(){

        // col 4 hucre TEKRARLAYABILIR input olarak dusunulcek
        // row depth

        bt(0);

    }

    public  void bt(int row){

        if(row == p.board.length){ // DEPTH bitis sarti
        result.add(p.boardConvertToString());
        p.printBoard();
        return;
        }

        for(int col = 0; col< p.board.length;col++){ // col inputlari
            // col = 0 (col = start degil)

            if(!isValid(row,col)){
                continue;
            }

            p.board[row][col]='Q';
            colSet.add(col);
            posDiag.add(row+col);
            negDiag.add(row-col);

            bt(row+1);
            // 3. ADIM Remove action
            p.board[row][col]='.';
            colSet.remove(col);
            posDiag.remove(row+col);
            negDiag.remove(row-col);

        }

    }

    private boolean isValid(int row, int col){
        if(colSet.contains(col) || posDiag.contains(row+col)|| negDiag.contains(row-col)){
            return false;
        }
        return true;
    }
}



class ParamsVer2 {
    // 4x4 empty board

     char[][] board = {
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'},

    };

    public void printBoard(){
        System.out.println(Arrays.deepToString(board));
    }

    public List<String> boardConvertToString(){
        List<String> string = new ArrayList<>();
        for(int i =0;i< board.length;i++){
            String temp = "";
            for(int j =0;j< board.length;j++){
               temp = temp+ board[i][j];

            }
            string.add(temp);
        }
        return string;
    }
}
