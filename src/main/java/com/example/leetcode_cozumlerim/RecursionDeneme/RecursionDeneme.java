package com.example.leetcode_cozumlerim.RecursionDeneme;

import java.util.*;

public class RecursionDeneme {

    public void doIt(){

// in degismeden cikiyor
        // peki object
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);
        l.add(3);
        List<Integer> curr = new ArrayList<>();
        re(0,l,curr);

        int a =0;

    }

    private void re(int start ,List<Integer> l, List<Integer> curr){

//        if(curr.size()==5){ //  depth of the tree // bitis sarti
//            return;
//        }
        for(int i= start;i< l.size();i++){

            int a = l.get(i);
            System.out.println(a);
            curr.add(a);
            System.out.println(Arrays.deepToString(curr.toArray()));
            re(i+1,l,curr);
//            re(i,l,curr);
            curr.remove(curr.size() -1);

        }


    }
}
