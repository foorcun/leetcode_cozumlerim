package com.example.leetcode_cozumlerim.Backtracking.Subsets78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// link: https://www.youtube.com/watch?v=REOH22Xwdkk
public class Subsets { // bu algoritma bir dalin en alttaki Node una inip siblings olarak ekiyor. Subsets2 deki algoritma Tree deki Node ugradigi anda resulta ekliyor.
    static int counter =0;
    private static void dfs(int i,List<List<Integer>> result, List<Integer> current,  int[] nums) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(current));
//            counter++;
//            var vv = current.toString();
//            System.out.println(Arrays.deepToString(result.toArray()));
            return;
        }

        // decision to include nums[i]
        current.add(nums[i]);
        var vvv0 = current.toString();

        dfs(i + 1,result, current,  nums);

        // decision to NOT TO include nums[i]
        current.remove(current.size() - 1);
        var vvv = current.toString();
        dfs(i + 1,result, current,  nums);
    }
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs( 0,result, current, nums);
        return result;
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