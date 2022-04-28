package com.example.leetcode_cozumlerim.Backtracking.maze;

import java.util.Arrays;

public class MazeFinder {
    int[][] world = new Param().world;
    int[][] map = new Param().map;
//    public void findPath(int[][] world){
     public boolean findPath(int row , int col){


        // 6. ADIM - put pointer next one
        // birden fazla input varsa diger pointeri ileri tasimak gerekiyor
        // bir pointer varsa o da zaten input ile ileri tasiniyor

        // 7. ADIM Bitis sarti

         if(row == world.length-1 && col == world.length-1){
             return true;
         }

        //4. Adim DFS - for loop for all possible values
         String[] yonler = {"r","l","u","d"};
         for(int i =0;i < yonler.length;i++){

        //5. ADIM - isValid check - rules of the game
             if(!isValid(row, col,i,world,map)){
                 continue;
             }

        //1. ADIM Action
        if(yonler[i] =="r"){
            col++;
        }else if(yonler[i] =="l"){
            col--;
        }else if(yonler[i] =="u"){
            row--;
        }else if(yonler[i] =="d"){
            row++;
        }
        map[row][col]= 1;


        // 2. ADIM Iteration
        // ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor
         if(findPath(row,col)==true){
//             System.out.println(Arrays.deepToString(map));
             return true;
         }

        // 3. ADIM Remove action
         map[row][col]= 0;
         if(yonler[i] =="r"){
             col--;
         }else if(yonler[i] =="l"){
             col++;
         }else if(yonler[i] =="u"){
             row++;
         }else if(yonler[i] =="d"){
             row--;
         }
         }

         return false;
    }

    private boolean isValid(int row ,int col, int i,int[][] world,int[][] map){

        if(i ==0){
            col++;

        }else if(i ==1){
            col--;

        }else if(i ==2){
            row--;

        }else if(i ==3){
            row++;

        }
       if( row>=0 && row<world.length && col>=0&& col<world.length && world[row][col] == 1 && world[row][col]==1){ //
           if(map[row][col] == 1){ //map ile visited check yapiyorz
                return false;
           }
           return true;
       }
         return false;
    }

    public void printTheWorld() {
//        System.out.println(Arrays.deepToString(world));
        for(int i =0;i< world.length;i++){
            System.out.println(Arrays.toString(world[i]));
        }
    }

    public void printTheMap() {
//        System.out.println(Arrays.deepToString(map));
        for(int i =0;i< map.length;i++){
            System.out.println(Arrays.toString(map[i]));
        }

    }
}


 class Param{


     int[][] world0 = {
             {1, 1, 0,0},
             {1, 1, 1,0},
             {0, 1, 1,0},
             {0, 0, 1,1}};


  int[][] world1  = {{1, 0, 0, 0},
     {1, 1, 0, 1},
     {0, 1, 0, 0},
     {1, 1, 1, 1}};
     int[][] world  = {
             {1, 1, 0, 0,0,1,1},
             {0, 1, 1, 1,1,1,1},
             {1, 0, 0, 1,0,1,1},
             {0, 1, 1, 1,0,0,1},
             {0, 1, 0, 1,1,0,0},
             {1, 0, 1, 1,1,1,1},
     };



     int[][] map0 = {
             {1, 0, 0,0},
             {0, 0, 0,0},
             {0, 0, 0,0},
             {0, 0, 0,0}};

     int[][] map ={
             {1, 0, 0, 0,0,0,0},
             {0, 0, 0, 0,0,0,0},
             {0, 0, 0, 0,0,0,0},
             {0, 0, 0, 0,0,0,0},
             {0, 0, 0, 0,0,0,0},
             {0, 0, 0, 0,0,0,0},
     };
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