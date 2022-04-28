package com.example.leetcode_cozumlerim.Backtracking.Temeller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temel1 {
    //3 elemanli bir girdi - elemanlari tekrar etMEZ
    public static void doIt(){
        int[] input = new int[] {1,5,3};
        bt(0,input,new ArrayList<>() );
    }
    private static void bt(int start, int [] input, List<Integer> curr){

        for(int i = start ;i< input.length;i++){

            curr.add(input[i]);//action
            bt(i+1,input,curr);//bt
            curr.remove(curr.size() -1);//undo
        }

    }
}
