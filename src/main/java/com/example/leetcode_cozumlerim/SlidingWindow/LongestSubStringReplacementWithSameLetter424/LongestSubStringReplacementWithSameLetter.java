package com.example.leetcode_cozumlerim.SlidingWindow.LongestSubStringReplacementWithSameLetter424;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.max;

//https://www.youtube.com/watch?v=00FmUN1pkGE&ab_channel=NickWhite

public class LongestSubStringReplacementWithSameLetter {
    public static int characterReplacement(String s, int k) {

       // if(k>= s.length()) return s.length();

       int l=0, r=0;

       int longest =0;

       Map<Character, Integer> charCount = new HashMap<>();

       while(r< s.length()){

           char end = s.charAt(r);
           charCount.put(end, charCount.getOrDefault(end,0)+1);

           while(r-l+1 - max(charCount.values()) > k){
               char start = s.charAt(l);
               charCount.put(start,charCount.get(l)-1);
               l++;
           }

            longest = Math.max(longest,r-l+1);

           r++;
       }

return longest;
    }
}
