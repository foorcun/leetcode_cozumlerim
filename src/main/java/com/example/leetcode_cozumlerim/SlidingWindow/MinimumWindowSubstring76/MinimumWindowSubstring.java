package com.example.leetcode_cozumlerim.SlidingWindow.MinimumWindowSubstring76;

import java.util.HashMap;

public class MinimumWindowSubstring {

    //sliding window
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>(); // Table - HashMap

        for (char x : t.toCharArray()) { // Table - HashMap degerleri doldurmaca
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int matched = 0; // check codition
        int start = 0; // left pointer
        int minLen = s.length() + 1; // result holder for right pointer
        int subStr = 0; // result holder for left pointer
        for (int endWindow = 0; endWindow < s.length(); endWindow++) { // for icinde right pointer endWindow
            char right = s.charAt(endWindow); // char right value holder, pointer degil
            if (map.containsKey(right)) { // ilgili char t hedefinde var mi
                map.put(right, map.get(right) - 1); // varsa eldeki t HashMap table den 1 azalt
                if (map.get(right) == 0) matched++; // ilgili element sayi olarak condition i sagladi
            }

            while (matched == map.size()) { // eger conditionlarin hepsi saglanmissa bu true olmasi lazim
                if (minLen > endWindow - start + 1) {
                    minLen = endWindow - start + 1;
                    subStr = start;
                }
                char deleted = s.charAt(start++);
                if (map.containsKey(deleted)) {
                    if (map.get(deleted) == 0) matched--;
                    map.put(deleted, map.get(deleted) + 1); // left pointer move Pop
                }
            }
        }
        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
    }
}
