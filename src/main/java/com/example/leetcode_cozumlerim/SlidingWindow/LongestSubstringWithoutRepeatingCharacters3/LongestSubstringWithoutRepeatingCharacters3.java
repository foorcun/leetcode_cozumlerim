package com.example.leetcode_cozumlerim.SlidingWindow.LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {

    public static int lengthOfLongestSubstring(String s) {


        if (s == "") return 0;

        int l = 0, r = 0;

        int longest = 0;

        Set<Character> window = new HashSet<>();

        while (r < s.length()) {

            if (!window.contains(s.charAt(r))) {
                window.add(s.charAt(r));

                if (r - l + 1 > longest) longest = r - l + 1;

                r++;


            } else {
                window.remove(s.charAt(l)); //pop action
                l++;
            }


        }

        return longest;

    }

}
