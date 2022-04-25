package com.example.leetcode_cozumlerim.SubsetII98;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {


        Arrays.sort(nums);
        result = new ArrayList<>();

        bt(0 ,new ArrayList<>(),nums);

        return result;

    }

    private static void bt(int start, ArrayList<Integer> curr,int[] nums){
        // start = 0 , tree nin tepe Nodu ki bos kume []
        result.add(new ArrayList<Integer>(curr)); // Tum kombinasyonlari toplandigi result.
        // curr burda gecici olarak elemanlari tutan Box gibi
        // bu Box a tum kombinasyonlar gelip gidiyor

        for(int i = start ; i < nums.length; i++){ // 4. Adim tum olasiliklarin loop edilmesi

            // 5. Adim isValid
            if(i> start && nums[i]== nums[i-1]){
                continue;

            }

            curr.add(nums[i]); //1. ADIM action
            bt(i+1,curr,nums); // 2. ADIM Iteration
            curr.remove(curr.size()-1); // 3. ADIM Remove Action
            // remove action da i degilde curr.size()-1 almamizin sebebi
            // curr eleman sayisi ile i nin baglantisi yok
            // curr.add (en sona yeni eleman ekler)  in tersi curr.remove (son elemani siler)
        }


    }


}