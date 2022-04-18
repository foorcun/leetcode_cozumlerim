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
// link: https://www.youtube.com/watch?v=G0_I-ZF0S38 // neetcode
// link: https://www.youtube.com/watch?v=jY-EUKXYT20&t=257s // guzel gorsel anlatim
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){ // bu kod "bos" linked list pass edilirse diye bir check.
            // yani pass edilen LinkedList en az bir uyeye(head) sahip olmalidir sarti.
            return head;
        }

        ListNode prev = null; // left pointer
        ListNode curr = head; // right pointer

        while(curr != null){ //bu sart, curr pointer son elemanida gecerse null olur ve LinkedList biter.;
            //burda Swap olayi yapiliyor
            ListNode temp = curr.next; // bu suanki next Nodu elde tutuyor
            curr.next = prev; // bu curr daki Nodu umuzun ok yonunu ters ceviriyor
            prev = curr; // prev bir adim ilerler
            curr = temp; // curr bir adim ilerler

        }
        return prev; // curr == null => artik prev eski son Node, yeni Head demektir.

    }
}

