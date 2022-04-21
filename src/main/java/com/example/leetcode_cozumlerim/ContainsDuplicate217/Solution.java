package com.example.leetcode_cozumlerim.ContainsDuplicate217;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // HashSet
        Set<Integer> hs = new HashSet<>();

        for(int num : nums){

            if(hs.contains(num)) return true;
            hs.add(num);
        }
        return false;

    }
}