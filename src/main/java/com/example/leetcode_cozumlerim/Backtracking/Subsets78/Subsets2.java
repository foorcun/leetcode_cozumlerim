package com.example.leetcode_cozumlerim.Backtracking.Subsets78;

import java.util.ArrayList;
import java.util.List;

// link: https://www.youtube.com/watch?v=B8ZEcSAliM4
public class Subsets2 { // bu algoritma Tree deki Node ugradigi anda resulta ekliyor. class Subsets teki algoritma bir dalin en alttaki Node una inip siblings olarak ekiyor

    public static List<List<Integer>> result = new ArrayList<>();
    public  static List<List<Integer>> subsets(int[] nums){

        result = new ArrayList<>();


        bt(0 ,new ArrayList<>(),nums);
        // start = 0 degeri ile basliyor. yani Tree nin tepesi Node u


        return result;
    }

    private static void bt(int start, ArrayList<Integer> curr,int[] nums){
        // start = 0 , tree nin tepe Nodu ki bos kume []
        result.add(new ArrayList<Integer>(curr)); // Tum kombinasyonlari toplandigi result.
        
        // curr burda gecici olarak elemanlari tutan Box gibi
        // bu Box a tum kombinasyonlar gelip gidiyor

        for(int i = start ; i < nums.length; i++){ // 4. Adim tum olasiliklarin loop edilmesi

            // 5. Adim isValid e gerek yok cunku tum elemanlar kullanilabilir.

            curr.add(nums[i]); //1. ADIM action
            bt(i+1,curr,nums); // 2. ADIM Iteration
            curr.remove(curr.size()-1); // 3. ADIM Remove Action
            // remove action da i degilde curr.size()-1 almamizin sebebi
            // curr eleman sayisi ile i nin baglantisi yok
            // curr.add (en sona yeni eleman ekler)  in tersi curr.remove (son elemani siler)
        }


    }

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
