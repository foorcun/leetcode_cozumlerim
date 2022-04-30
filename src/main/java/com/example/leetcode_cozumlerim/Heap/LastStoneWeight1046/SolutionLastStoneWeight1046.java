package com.example.leetcode_cozumlerim.Heap.LastStoneWeight1046;

import java.util.PriorityQueue;


// link: https://github.com/ndesai15/coding-java/blob/master/src/com/coding/patterns/heap/LastStoneWeight.java
public class SolutionLastStoneWeight1046 {
    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);

        for(int s : stones){
//            System.out.println("s degeri " + s);
            maxHeap.add(s);
//            System.out.println(maxHeap.peek());
        }

        play(maxHeap);


        // check if there is any stone left to return or not.
        return maxHeap.isEmpty() ? 0: maxHeap.peek();

//        if(maxHeap.peek()==null)
//            return 0;
//    return maxHeap.peek();
    }
    private static void play( PriorityQueue<Integer> maxHeap){

        int yStone;
        int xStone;

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone1 != stone2) {
                maxHeap.add(stone1 - stone2);
            }


//            while( maxHeap.size()>1){
//
//                yStone = maxHeap.poll();
//                System.out.println("yStone degeri " +yStone);
//
//                Integer xI = maxHeap.poll();
////                if(xI == null){
////                    maxHeap.add(yStone);
////                    return;
////                }
////        while(xI != null){
//            xStone= xI.intValue();
//        System.out.println("xStone degeri " + xStone);
//            //        if(xStone == null){}
//
//            if(xStone==yStone){
//                yStone= -1;
////           xStone=-1;
//            }else{
//                yStone= yStone-xStone;
//
//            }
//
//            if(yStone!=-1) maxHeap.add(yStone);
//
//        }
//
//

        }
    }
}
