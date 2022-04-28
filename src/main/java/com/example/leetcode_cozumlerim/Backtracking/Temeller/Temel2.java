package com.example.leetcode_cozumlerim.Backtracking.Temeller;

import java.util.ArrayList;
import java.util.List;

public class Temel2 {
    //3 elemanli bir girdi - elemanlari tekrar EDER - Depth of the Tree
    public static void doIt() {
        int[] input = new int[]{1, 5, 3};
        bt1(0, input, new ArrayList<>());
        bt2(0, input , new ArrayList<>());
        bt3(0, input , new ArrayList<>());
    }

    private static void bt1(int start, int[] input, List<Integer> curr) {

        if(curr.size() == 1){ // Depth of the Tree 1
            return;
        }
        for (int i = start; i < input.length; i++) {
            curr.add(input[i]);//action
            bt1(i, input, curr);//bt
            curr.remove(curr.size() - 1); //undo
        }


    }

    private static void bt2(int start, int[] input, List<Integer> curr) {

        if(curr.size() == 2){ // Depth of the Tree 1
            return;
        }
        for (int i = start; i < input.length; i++) {
            curr.add(input[i]);//action
            bt2(i, input, curr);//bt
            curr.remove(curr.size() - 1); //undo
        }


    }
    private static void bt3(int start, int[] input, List<Integer> curr) {

        if(curr.size() == 3){ // Depth of the Tree 1
            return;
        }
        for (int i = start; i < input.length; i++) {
            curr.add(input[i]);//action
            bt3(i, input, curr);//bt
            curr.remove(curr.size() - 1); //undo
        }
    }
}
