package com.example.leetcode_cozumlerim.ReverseLinkedList_206;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){ // Bitirme sarti
            return head;
        }

        ListNode prev = null; // left pointer
        ListNode curr = head; // right pointer

        while(curr != null){
            //burda Swap olayi yapiliyor
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;

    }
}

