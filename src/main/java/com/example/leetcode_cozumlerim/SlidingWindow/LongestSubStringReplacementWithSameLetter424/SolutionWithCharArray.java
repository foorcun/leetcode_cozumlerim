package com.example.leetcode_cozumlerim.SlidingWindow.LongestSubStringReplacementWithSameLetter424;

public class SolutionWithCharArray {


    public static int characterReplacement(String s, int k) {

        int l=0, r=0;

        int maxLength =0;
        int maxCount =0;

        int[] char_counts = new int[26];

        while(r<s.length()){

            char_counts[s.charAt(r) - 'A']++; // r moves
            int current = char_counts[s.charAt(r)-'A'];

            maxCount = Math.max(maxCount,current);

            while(r-l-maxCount+1 > k){
                char_counts[s.charAt(l) - 'A']--; // pop action
                l++; // l moves
            }

            maxLength = Math.max(maxLength,r-l +1);
            r++;
        }

        return maxLength;
    }
}
