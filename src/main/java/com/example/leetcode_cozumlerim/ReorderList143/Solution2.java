package com.example.leetcode_cozumlerim.ReorderList143;

public class Solution2 { // merge with just pointers
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


        //merge
        ListNode f = head; // pointer for first-half
        ListNode s = prev; // pointer for second-half
        while (s != null) { // second-half ya ayni uzunlukta ya daha kisa o yuzden sadece buna baksak yeter
            ListNode temp1 = f.next;
            ListNode temp2 = s.next;

            f.next = s; // f -> s yapar
            s.next = temp1; // s-> temp1(ilk f.next) yapar
            f = temp1; // f = temp1(ilk f.next yani pointer i bir ileri tasir)
            s = temp2; // s = temp2(ilk s.next yani pointer i bir ileri tasir)

        }

        //return dummy.next;
    }
}