package com.example.leetcode_cozumlerim.CombinationSumII40;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        bt(0,candidates, target,result, new ArrayList<Integer>());

        return result;
    }

    private void bt(int start, int[] cand, int target,List<List<Integer>> result, ArrayList<Integer> curr){

        if(sumOf(curr)> target){
            return;
        }

        if(sumOf(curr)== target){
            result.add(new ArrayList<>(curr));
        }

        for(int i = start;i<cand.length;i++){

            if(i>start && cand[i]==cand[i-1]){
                continue;
            }

            curr.add(cand[i]);
            bt(i+1,cand,target,result,curr);
            curr.remove(curr.size()-1);



        }

    }
    private int sumOf(ArrayList<Integer> curr){
        int sumOf=0;

        for(int i = 0 ; i<curr.size(); i++){
            sumOf = sumOf + curr.get(i);
        }


        return sumOf;
    }
}