package com.example.leetcode_cozumlerim.ReorderList143;

public class Solution { // merge with DummyNode
    ListNode head = new ListNode(1,
            new ListNode(2,
                    new ListNode(3,
                            new ListNode(4, null))));

    //public void reorderList(ListNode head) {
    public void reorderList() {
        ListNode head = this.head;
        //two pointer - slow-fast
        ListNode l = head;
        ListNode r = head.next;


        //move pointers to take a half

        while (r != null && r.next != null) {
            l = l.next;

            if (r.next.next == null) {
                r = r.next;
            } else {
                r = r.next.next;
            }

        }

        //reverse second half
        // head of second half
        ListNode second = l.next; // second = head of second-half // reverse pointer
        l.next = null; // first-half artik secondtan ayrilmis oldu

        ListNode prev = null; // prev; second-half reverse icin pointer

        while (second != null) {
            ///3 pointer
            ListNode temp = second.next; // next Node kaybolmasin diye tutuyoruz
            second.next = prev; // node Link i geri ceviriyor
            prev = second; // prev pointer bir ilerler
            second = temp; // current pointer bir ilerler // second burda null olunca loop biter. prev=tail olur.
        }


        //merge with DummyNode
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        ListNode f = head; // pointer for first-half
        ListNode s = prev; // pointer for second-half
        System.out.println("sdfasdf " + s.val);

        while (f != null || s != null) {
            if (f != null) {
                tail.next = f;
                f = f.next;
                tail = tail.next;

            }
            if (s != null) {
                tail.next = s;
                s = s.next;
                tail = tail.next;

            }


        }

        //return dummy.next;
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
