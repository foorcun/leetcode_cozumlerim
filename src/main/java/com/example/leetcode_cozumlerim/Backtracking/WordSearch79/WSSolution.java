package com.example.leetcode_cozumlerim.Backtracking.WordSearch79;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WSSolution {

    Params p = new Params();

    List<String> curr = new ArrayList<>();

    //    public boolean exist(char[][] board, String word) {
    public boolean exist() {

        // no need whole results

        if(p.board[0].length ==1 && p.board[0][0] != p.word.charAt(0) ){
            return false;
        }


        String[] yonler = new String[]{"r", "l", "u", "d"};
//        int row = 0;
//        int col = 0;
        for (int row = 0; row < p.board.length; row++) {

            for (int col = 0; col < p.board[0].length; col++) {
                if (bt(row, col, yonler) == true) {
                    return true;
                } //
                // curr

            }
        }


        return false;


    }

    private boolean bt(int row, int col, String[] yonler) {

        System.out.println("cagirilidim bt()");
        System.out.println(Arrays.deepToString(curr.toArray()));
        System.out.println(p.word.length());
        if(col == p.board[0].length){
            row++;
            col = 0;
        }

        if(row == p.board.length){
            return false;
        }

        if (p.word.length()==1){
            return true;
        }

        // search the next cell
        if(p.board[row][col] != p.word.charAt(0) ){
            return bt(row,col+1,yonler);
        }

//        if(p.board[row][col]!=p.word.charAt(0)){
//            return false;
//        }


        for (int i = 0; i < yonler.length; i++) {

            if (!isValid(row, col, i)) {
                continue;
            }

            var temp = p.board[row][col];
            p.board[row][col] = 1;

            if (i == 0) {
                col++;

            } else if (i == 1) {
                col--;

            } else if (i == 2) {
                row--;

            } else if (i == 3) {
                row++;

            }

            System.out.println("ilk hal " + p.word);
            p.word = p.word.substring(1, p.word.length());
            System.out.println("sonraki hal " + p.word);

            curr.add(yonler[i]);
            System.out.println("bt oncesi");
            System.out.println(Arrays.deepToString(curr.toArray()));
//            bt(row, col, yonler);
            if(bt(row,col,yonler)==true){
                return  true;
            }

            if (i == 0) {
                col--;

            } else if (i == 1) {

                col++;


            } else if (i == 2) {
                row++;


            } else if (i == 3) {
                row--;


            }
            System.out.println("i bu : " + i);
            p.board[row][col] = temp;
            p.word = temp + p.word;
            curr.remove(curr.size() -1);
            System.out.println("bt sonrasi");
            System.out.println(Arrays.deepToString(curr.toArray()));



        }

        return false;

    }

    private boolean isValid(int row, int col, int i) {

        if (i == 0) {
            col++;

        } else if (i == 1) {
            col--;

        } else if (i == 2) {
            row--;

        } else if (i == 3) {
            row++;

        }
//        var v = p.word.charAt(1);
//        var vv = p.board[row][col];
        if (0 <= row && row < p.board.length  && 0 <= col && col < p.board[0].length && p.word.length()>1 && p.word.charAt(1) == p.board[row][col]) {
            return true;
        }

        return false;
    }

//    private void move(int row ,int col, int i){
//
//        if(i ==0){
//            col++;
//
//        }else if(i ==1){
//            col--;
//
//        }else if(i ==2){
//            row--;
//
//        }else if(i ==3){
//            row++;
//
//        }
//
//
//    }


//    private void unmove(int row ,int col, int i){
//
//        if(i ==0){
//            col--;
//
//        }else if(i ==1){
//
//            col++;
//
//
//        }else if(i ==2){
//            row++;
//
//
//        }else if(i ==3){
//            row--;
//
//
//        }
//
//
//    }
}


class Params {


    char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

//    String word = "ABCCED";
    String word = "SEE";
}