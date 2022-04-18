package com.example.leetcode_cozumlerim.AddTwoNumber2;


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

// link: https://www.youtube.com/watch?v=wgFPrzTjm7s
// link : https://www.youtube.com/watch?v=aM4Iv7eEr2o
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(); // datasi olamaya, gecici bir Dummy node yaratiyorz.
        ListNode tail = dummy; // cevap LinkedListi olusturmaya bu Dummy node ile basliyorz

        ListNode curr1 = l1; // genel pointer adlarim
        ListNode curr2 = l2; // genel pointer adlarim

        int elde = 0; // toplama da olusacak elde ler icin

        while (curr1 != null || curr2 != null || elde != 0) { // listler null degeilse ya da elde 0 degilse
            int v1 = 0;
            int v2 = 0;

            if (curr1 != null) {
                v1 = curr1.val;
            } else {
                v1 = 0;
            }
           // v1 = (curr1 != null) ? curr1.val : 0; //  bu sekilde ternary de kullanilabilirdi

            if (curr2 != null) {
                v2 = curr2.val;
            } else {
                v2 = 0;
            }

            // asil toplama islemi
            int val = v1 + v2 + elde;
            elde = val / 10;
            val = val % 10;
            tail.next = new ListNode(val);

            tail = tail.next;
            if (curr1 != null) curr1 = curr1.next;
            else curr1 = null;
            if (curr2 != null) curr2 = curr2.next;
            else curr2 = null;
        }


        return dummy.next;

    }
}