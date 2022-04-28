package com.example.leetcode_cozumlerim.Backtracking.LetterCombinationsofaPhoneNumber17;

import java.util.*;

public class Solution {

    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {



        Map<String,String[]> letters = new HashMap<>();
        letters.put("2",new String[] {"a","b","c"});

        System.out.println(Arrays.toString(letters.get("2")));
//        System.out.println(digits.charAt(0));

        bt(0,1,digits,new ArrayList<String>());

        return result;
    }

    private void bt(int start,int startS,String digits,List<String> curr){

        for(int i =start;i<getLetters(digits.charAt(startS)).length;i++){

            System.out.print("curr oncesi "+Arrays.deepToString(curr.toArray()));
            curr.add(getLetters(digits.charAt(startS))[i]);
            System.out.println("curr sonrasi "+Arrays.deepToString(curr.toArray()));
            bt(i+1,startS,digits,curr);
            curr.remove(curr.size()-1);
        }
    }


    private String[] getLetters(char c){

        if(c=='2'){

            return new String[]{"a","b","c"};
        }else if(c=='3'){
            return new String[] {"d","e","f"};
        }

        return null;
    }
}
