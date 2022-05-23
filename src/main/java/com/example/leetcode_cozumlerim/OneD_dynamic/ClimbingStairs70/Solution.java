package com.example.leetcode_cozumlerim.OneD_dynamic.ClimbingStairs70;

public class Solution {

    public int climbStairs(int n) { // bastan baslamacali

        if(n == 1) return 1;

        // dp Table olarak gorev yapiyor
        int[] dp = new int[n+1]; // n+1 adet yapiyoruz cunku kullanim kolayligi olsun die.
        // bu sekil yapinca ilk elemani dp[1] e koyup dp[0] bos birakarak
        // sanki arrayi "1" den baslatiyormus gibi kullaniyorz
        dp[1]=1; // bir basamak varken : 1 step. sonuc 1 adet
        dp[2]=2; // iki basamak varken : 1 + 1 , 2 . sonuc 2 adet


        // ya da base kaseleri
        //dp[2]=2; // ornekte verilen sonuc: 2
        //dp[3]=3; // ornekte verilen sonuc: 3
       // for(int i = 4;i<n+1;i++){ // bu sekilde de yapabilirdik // n+1 cunku arrayi 1 den baslattik
       //     dp[i] = dp[i-1] + dp[i-2];
       // }


        for(int i = 3;i<n+1;i++){ // n+1 cunku arrayi 1 den baslattik
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }

}
