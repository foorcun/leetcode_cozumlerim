package com.example.leetcode_cozumlerim.SudokuSolver37;

import java.util.Arrays;

public class Solution {
  public char[][] input = new Params().board;
    int c =0;
    int r =0;

    char [][] board;


    public void solveIt(char[][] board){
        this.board = board;
        helper(0,0);


//
//      // dolu yere islem yapilmaz
//      if(this.input[r][c]!='.'){
////          solveIt(r +1);
//      }
  }

  private boolean helper(int row, int col){
      //start the next row
      if(col == 9){
          row++;
          col = 0;
      }

      // finish the search
      //bitis sarti
      if(row ==9){
          return true;
      }

      // search the next cell // burda sayi varsa action yapma sonrakine gec!
      if(board[row][col] != '.'){
          return helper(row,col+1);
      }

      //DFS all valid options
      for(char i='1';i<='9'; i++){ // koyulacak degerlerin tek tek denemesi loop

          //isValid to Continue
          if(!isValid(row,col,i)){
              continue;
          }
          board[row][col]=i; // Action
          if(helper(row,col+1)==true) { // bitti mi check
              printTheBoard(this.board);
              return true;
          }
          board[row][col]='.'; // Remove action
      }
      return  false; // dead endlerden birine gelindei ya da cozulemedi
  }

    private boolean isValid(int row, int col, char cur) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == cur)
                return false;
            if (board[i][col] == cur)
                return false;
        }
        int[] rowBorder = findSE(row);
        int[] colBorder = findSE(col);

        for (int i = rowBorder[0]; i <= rowBorder[1]; i++) {
            for (int j = colBorder[0]; j <= colBorder[1]; j++) {
                if (board[i][j] == cur)
                    return false;
            }
        }
        return true;
    }

    private int[] findSE(int coor) {
        int[] res = new int[2];
        if (coor < 3) {
            res[1] = 2;
        } else if (coor < 6) {
            res[0] = 3;
            res[1] = 5;
        } else if (coor < 9) {
            res[0] = 6;
            res[1] = 8;
        }
        return res;
    }

  public void printTheBoard(char[][] input){

      System.out.println(Arrays.deepToString(input));
  }
}


 class Params {

    char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

}
