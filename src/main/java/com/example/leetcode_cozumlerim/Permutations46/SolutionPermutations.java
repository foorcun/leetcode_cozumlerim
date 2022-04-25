package com.example.leetcode_cozumlerim.Permutations46;

import java.util.ArrayList;
import java.util.List;

// link : https://www.youtube.com/watch?v=idmgLLNIC2U
public class SolutionPermutations {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){

        boolean [] used = new boolean[nums.length];
        bt(new ArrayList<Integer>(),nums , used);

        return  result;
    }


    private void bt( ArrayList<Integer> curr, int nums[], boolean[] used){

        // 6. ADIM - put pointer next one
// birden fazla input varsa diger pointeri ileri tasimak gerekiyor
// bir pointer varsa o da zaten input ile ileri tasiniyor

// 7. ADIM Bitis sarti

//// ASIL BACKTRACK algoritmasi 4 ADIMdan olusuyor. 5,6,7 . adimlar backtrackin BULDUGU ILK OLASI degeri alip kullanmak
/// ustune kurulu. mesela n-queen ya da sudoku. diyor ki " bana OLABILIR i olan bir deger ver. olursa devam olmazsa bir sonraki.."
// BACKTRACK aslinda KOMBINASYON bulma ile ilgili
// kombinasyonlarin tamami icin for kod satiri hemen ustunde RESULT ADIMI kullanmak gerekir. class Subsets2 oldugu gibi

        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
//            if(start == 3){return;}
        }

//4. Adim DFS - for loop for all possible values
        for(int i=0 ; i< nums.length;i++){;
//5. ADIM - isValid check - rules of the game
    if(used[i] == true){
        continue;
    }
//1. ADIM Action
           used[i]= true; // bir kere element kullanildigi zaman ikinciye siradaki kullansin istedigimiz icin var
        curr.add(nums[i]);
// 2. ADIM Iteration
            bt( curr,nums, used);
// ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor

            // 3. ADIM Remove action
            curr.remove(curr.size() -1);
            used[i]= false;

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