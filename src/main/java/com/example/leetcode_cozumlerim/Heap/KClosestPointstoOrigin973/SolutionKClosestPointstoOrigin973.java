package com.example.leetcode_cozumlerim.Heap.KClosestPointstoOrigin973;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class SolutionKClosestPointstoOrigin973 {
    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b)->a[0]-b[0]);
    int[][] result ;
    public int[][] kClosest(int[][] points, int k) {

        result = new int [k][2];

        for(int[] p : points){
            int dist=(p[0]*p[0] + p[1]*p[1]);
            minHeap.add(new int[] {dist,p[0],p[1]});
        }

        while(k>0){

            result[k-1] = Arrays.copyOfRange(minHeap.poll(),1,2);
//            result[k-1][0] = minHeap.peek()[1];
//            result[k-1][1] = minHeap.peek()[2];
//            minHeap.poll();

            k--;
        }

        return result;
    }
}