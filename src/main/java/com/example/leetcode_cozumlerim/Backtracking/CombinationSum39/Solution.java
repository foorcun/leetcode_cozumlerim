package com.example.leetcode_cozumlerim.Backtracking.CombinationSum39;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {


        bt(0,candidates, target,new ArrayList<Integer>());
        return result;
    }

    public void bt(int start,int[] candidates, int target , ArrayList<Integer> curr){

        // Result adim ama sart var
        var a = sumOf(curr);
        if(sumOf(curr)== target){ // 7. Adim Bitis adimi
//            var vvvv0= Arrays.deepToString(curr.toArray());
//            System.out.println("curr is : " + vvvv0);
            result.add(new ArrayList<>(curr));
//            var vvvv= Arrays.deepToString(result.toArray());
//            System.out.println("Result is : " + vvvv);
        }

        for(int i = start; i< candidates.length; i++){ // 4. adim for loop


            // 5. Adim isValid
            if(sumOf(curr)>target){
                continue;
            }

            curr.add(candidates[i]); // 1. Adim action
//            System.out.println("curr : " + Arrays.deepToString(curr.toArray()));
            // bt inputu olan i degeri aslinda Aday degerimiz. i
            bt(i,candidates,target,curr);  // 2. Adim Iteration
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