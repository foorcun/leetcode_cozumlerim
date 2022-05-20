package com.example.leetcode_cozumlerim.SlidingWindow.BestTimetoBuyandSellStock121;


class Solution {
    public int maxProfit(int[] prices) {

        int l = 0, r = 1;

        int profit = 0;

        while (r < prices.length) {

            if (prices[r] < prices[l]) {
                l = r;
                r++;
                continue;
            }

            if (prices[r] - prices[l] > profit) profit = prices[r] - prices[l];

            r++;
        }

        return profit;


    }
}
