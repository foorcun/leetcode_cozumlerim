package com.example.leetcode_cozumlerim.KthLargestElementinaStream703;

import java.util.PriorityQueue;

public class KThLargestInStream {
    private int k;
    private PriorityQueue<Integer> minHeap;
    public KThLargestInStream(int k, int[] nums) {
        this.k=k;
        minHeap = new PriorityQueue<>((a , b) -> a - b); // minHeap
        for(int num: nums) {
            minHeap.add(num); // add new Node
        }
        while (minHeap.size() > k) {
            minHeap.poll(); // delete the Root Node
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek(); // read the value of Root Node
    }
}
