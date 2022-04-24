package com.example.leetcode_cozumlerim.N_Queens51;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Deneme4N {

    public char[][] board = new Params().board;
    Set<Integer> colSet = new HashSet();
    Set<Integer> posDiag = new HashSet(); // row + col
    Set<Integer> negDiag = new HashSet(); // row - col


    //    public List<List<String>> solveNQueens(int n) {
        public void solveNQueens() { // n =4
            helper(0);
    }

    public boolean helper (int row){

        // 6. ADIM - put pointer next one
        // birden fazla input varsa diger pointeri ileri tasimak gerekiyor
        // bir pointer varsa o da zaten input ile ileri tasiniyor

        // 7. ADIM Bitis sarti
            if(row== 4){
                return true;
            }

            //4. Adim DFS - for loop for all possible values
        for(int col=0;col < 4;col++){

            //5. ADIM - isValid check - rules of the game
            if(!isValid(row,col)){
                continue;
            }

            //1. ADIM Action
            board[row][col] = 'Q';
            colSet.add(col);
            posDiag.add(row+col);
            negDiag.add(row-col);

            // 2. ADIM Iteration
            // ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor
            if(helper(row+1)==true){
                // print area if necessary
                printTheBoard();
                return true;
            }

            // 3. ADIM Remove action
            board[row][col] = '.';
            colSet.remove(col);
            posDiag.remove(row+col);
            negDiag.remove(row-col);

        }
        return false;
    }

    private boolean isValid(int row, int col){
          if(colSet.contains(col) || posDiag.contains(row+col)|| negDiag.contains(row-col)){
              return false;
          }
          return true;
    }

    public void printTheBoard(){

        System.out.println(Arrays.deepToString(this.board));
    }
}


class Params {
    // 4x4 empty board

    char[][] board = {
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'},
            {'.','.','.','.'},

    };
}



// 6. ADIM - put pointer next one
// birden fazla input varsa diger pointeri ileri tasimak gerekiyor
// bir pointer varsa o da zaten input ile ileri tasiniyor

// 7. ADIM Bitis sarti

//4. Adim DFS - for loop for all possible values
//5. ADIM - isValid check - rules of the game

//1. ADIM Action

// 2. ADIM Iteration
// ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor

// 3. ADIM Remove action