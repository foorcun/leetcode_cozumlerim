package com.example.leetcode_cozumlerim.SlidingWindow.PermutationInString567;

import java.util.Arrays;

public class SolutionWithCharArray {

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length() || s2.length()==0) return false;
        if(s1.length() == 0 ) return true;

        int[] s1CharCounts = new int[26];
        int[] s2CharCounts = new int[26];

       for(int i = 0 ;i< s1.length();i++){ // s1 elemanlarini ve s1 uzunlugu kadarki s2 elemanlarini saymak
           s1CharCounts[s1.charAt(i)-'a']++;
           s2CharCounts[s2.charAt(i)-'a']++;
       }


       for(int i = s1.length();i<s2.length();i++){
           if(Arrays.equals(s1CharCounts,s2CharCounts)) return true;

           s2CharCounts[s2.charAt(i-s1.length())-'a']--;
           s2CharCounts[s2.charAt(i)-'a']++;
       }
       if(Arrays.equals(s1CharCounts,s2CharCounts)) return true;
       else return false;
    }
}
