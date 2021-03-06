package com.example.leetcode_cozumlerim.Heap.KthLargestElementinanArray215;

import java.util.PriorityQueue;

public class SolutionKthLargestElementinanArray215 {

    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b)-> b-a);

    public static int findKthLargest(int[] nums, int k) {

        String demo = "abcde";
        System.out.println(demo.substring(1,demo.length()));
        for(int n : nums){
            maxHeap.add(n);
        }

        while(k-1>0){

            maxHeap.poll();

            k--;
        }

        return maxHeap.peek();
    }
}
