package com.example.leetcode_cozumlerim.SlidingWindow.BestTimetoBuyandSellStock121;

public class BestTimetoBuyandSellStock121 {


    public int maxProfit(int[] prices) {

        int l= 0;
        int r =1;

        //int profit=Integer.MIN_VALUE;
        int profit =0;
        //int temp=Integer.MIN_VALUE;
        int temp =0;

        while(r<prices.length){
            if(prices[l]< prices[r]){
                temp = prices[r]-prices[l];

                if(temp>profit){
                    profit =temp;
                }

            }else{
                l=r;
            }
            r++;

        }
        return profit;

    }
}
