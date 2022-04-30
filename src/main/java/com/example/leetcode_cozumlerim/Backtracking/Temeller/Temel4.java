package com.example.leetcode_cozumlerim.Backtracking.Temeller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temel4 {

   static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> permute(){
        int[] nums = new int[] {1,2,3};
        boolean [] used = new boolean[nums.length];
        bt(nums ,new ArrayList<Integer>(), used);

        System.out.println(Arrays.deepToString(result.toArray()));
        return  result;
    }

    private static void bt(  int nums[], ArrayList<Integer> curr, boolean[] used){

        if(curr.size() == nums.length){ // burdan depth olarak alma yapiyoruz
            result.add(new ArrayList<>(curr));
        }

        for(int i=0 ; i< nums.length;i++){
            if(used[i] == true){ // her depth e giren eleman bu used listesine giriyor
                continue;
            }
            used[i]= true;
            curr.add(nums[i]);

            bt(nums, curr, used); // her depth e giren eleman bu used listesine giriyor
                                // bir sonraki depthe burdan veriliyor bu bilgi

            curr.remove(curr.size() -1);
            used[i]= false;

        }
    }
}
