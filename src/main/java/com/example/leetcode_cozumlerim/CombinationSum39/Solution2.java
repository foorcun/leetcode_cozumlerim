package com.example.leetcode_cozumlerim.CombinationSum39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leet code da Accepted aldigim kod bu
class Solution2 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {


        bt(0,new ArrayList<Integer>(),candidates, target);
        return result;
    }

    public void bt(int start, ArrayList<Integer> curr,int[] candidates, int target){

        // Result adim ama sart var
        if(sumOf(curr)== target){
            result.add(new ArrayList<>(curr));
        }

        for(int i = start; i< candidates.length; i++){ // 4. adim for loop

            // 5. Adim isValid
            if(sumOf(curr) > target){
                continue;
            }

            curr.add(candidates[i]); // 1. Adim action
            bt(i,curr,candidates,target);  // 2. Adim Iteration
            curr.remove(curr.size() -1 );  //3. adim Remove action



        }



    }
    public int sumOf(ArrayList<Integer> curr){
        int sumOf =0;

        for(int i =0 ; i< curr.size(); i++){

            sumOf = sumOf + curr.get(i);
        }


        return sumOf;
    }
}