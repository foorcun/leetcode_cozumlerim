package com.example.leetcode_cozumlerim.RemoveNthNodeFromEndofList19;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy= new ListNode(); // dummy as pointer of head
        dummy.next = head;
        // two pointer - same direction - same speed
        ListNode l = dummy;
        ListNode r = dummy;

        while (n>0){ // r pointeri, n kadar yurut
            r= r.next;
            n--;
        }

        while(r.next !=null){ // l ve r pointerlari sona kadar yurut
            r=r.next;
            l=l.next;
        }

        // delete
        l.next = l.next.next;


        return dummy.next;

    }
}



class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
