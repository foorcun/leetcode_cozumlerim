package com.example.leetcode_cozumlerim.Backtracking.SudokuSolver37;

import java.util.Arrays;

public class Solution {
  public char[][] input = new Params().board;

    char [][] board;


    public void solveIt(char[][] board){
        this.board = board;
        helper(0,0);
  }

    //DFS backtracking solver
   // boolean ya da void return edebilir
    //input olmak zorunda
  private boolean helper(int row, int col){
      //start the next row
      // 6. ADIM - put pointer next one
      // birden fazla input varsa diger pointeri ileri tasimak gerekiyor
      // bir pointer varsa o da zaten input ile ileri tasiniyor
      if(col == 9){
          row++;
          col = 0;
      }
      // finish the search // 7. ADIM Bitis sarti
      //bitis sarti
      if(row ==9){
          return true;
      }

      // search the next cell // burda sayi varsa action yapma sonrakine gec!
      if(board[row][col] != '.'){
          return helper(row,col+1);
      }

      //DFS all valid options
      for(char i='1';i<='9'; i++){ // 4. ADIM koyulacak degerlerin tek tek denemesi loop
          //4. Adim DFS - for loop for all possible values

          //isValid to Continue
          if(!isValid(row,col,i)){ // 5. ADIM
              //5. ADIM - isValid check - rules of the game
              continue;
          }

          board[row][col]=i;  //1. ADIM Action

          if(helper(row,col+1)==true) { // 2. ADIM Iteration
              // ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor
              printTheBoard(this.board);
              return true;
          }
          board[row][col]='.'; // 3. ADIM Remove action
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



// 6. ADIM - put pointer next one
// birden fazla input varsa diger pointeri ileri tasimak gerekiyor
// bir pointer varsa o da zaten input ile ileri tasiniyor

// 7. ADIM Bitis sarti

//// ASIL BACKTRACK algoritmasi 4 ADIMdan olusuyor. 5,6,7 . adimlar backtrackin BULDUGU ILK OLASI degeri alip kullanmak
/// ustune kurulu. mesela n-queen ya da sudoku. diyor ki " bana OLABILIR i olan bir deger ver. olursa devam olmazsa bir sonraki.."
// BACKTRACK aslinda KOMBINASYON bulma ile ilgili
// kombinasyonlarin tamami icin for kod satiri hemen ustunde RESULT ADIMI kullanmak gerekir. class Subsets2 oldugu gibi

//4. Adim DFS - for loop for all possible values
//5. ADIM - isValid check - rules of the game

//1. ADIM Action

// 2. ADIM Iteration
// ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor

// 3. ADIM Remove action