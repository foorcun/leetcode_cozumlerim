package com.example.leetcode_cozumlerim.LinkedListCycle141;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) { //just cycle detection check

        //base case
        if(head ==null || head.next==null){
            return false;
        }

        ListNode slow =head;
        ListNode fast =head.next;

        while(fast.next != null && fast.next.next!=null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;

    }
}
