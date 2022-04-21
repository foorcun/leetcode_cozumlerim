package com.example.leetcode_cozumlerim.FindtheDuplicateNumber287;


// link : https://www.youtube.com/watch?v=wjYnzkAhcNk
//link : https://www.youtube.com/watch?v=dfIqLxAf-8s
class Solution {
    public int findDuplicate(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        int slow =nums[0]; // pointer ilk elementte basliyor
        int fast = nums[nums[0]]; // pointer ikinci elementte basliyor

        while(slow != fast){ // finding cycle exist
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // finding kesisen nokta
        // slow reset
        slow =0;
        while (true){
            slow = nums[slow];
            fast = nums[fast]; // fast pointer going to be slow now

            if(slow == fast) return slow;

        }
    }
}