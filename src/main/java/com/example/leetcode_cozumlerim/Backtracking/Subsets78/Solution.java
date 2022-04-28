package com.example.leetcode_cozumlerim.Backtracking.Subsets78;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> setim = new HashSet<>();

    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
    this.nums=nums;
    helper(0);

        return result;
    }

    public boolean helper(int p){ // pointer

        //1. ADIM Action
        setim.add(nums[p]);

        // 2. ADIM Iteration
        // ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor
        helper(p++);




        return false;
    }

    // 6. ADIM - put pointer next one
// birden fazla input varsa diger pointeri ileri tasimak gerekiyor
// bir pointer varsa o da zaten input ile ileri tasiniyor

// 7. ADIM Bitis sarti

//4. Adim DFS - for loop for all possible values
//5. ADIM - isValid check - rules of the game


// 2. ADIM Iteration
// ve bitti mi check. if icinde helper(row,col+1) ile function calistiriliyor

// 3. ADIM Remove action
}
