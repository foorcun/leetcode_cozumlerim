package com.example.leetcode_cozumlerim.Backtracking.Temeller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temel3 {

    public static void doIt(){
        int[] input = new int[]{1, 5, 3};

        bt(0,input, new ArrayList<>());

    }

    public static void bt(int depth,int[] input ,  List<Integer> curr){

        if(depth==3){
            return;
        }


        for(int i =0 ; i< input.length;i++){


            curr.add(input[i]); //action
            System.out.println(Arrays.deepToString(curr.toArray()));
            bt(depth+1,input,curr); //bt
            curr.remove(curr.size() -1); // undo

        }
    }
}
