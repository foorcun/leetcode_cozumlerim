//package com.example.leetcode_cozumlerim.merge_two_sorted_list_21;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//        ListNode dummy = new ListNode(); // datasi olamaya, gecici bir Dummy node yaratiyorz.
//        ListNode tail = dummy; // cevap LinkedListi olusturmaya bu Dummy node ile basliyorz
//
//        ListNode curr1 = list1; // list1 icin genel kullandigim pointer adi
//        ListNode curr2 = list2; // list2 icin genel kullandigim pointer adi
//
//        while(curr1!= null && curr2!=null){ // pointer larimizdan biri null olana kadar loop
//            if(curr1.val < curr2.val){
//                tail.next = curr1; // curr1 kucuk olansa taile ekleme yapar
//                curr1 = curr1.next; // curr1 pointer ini bir sonraki node a tasir
//            }else {
//                tail.next = curr2;
//                curr2= curr2.next;
//            }
//            tail = tail.next; // tail e node eklendikce tail i bir sonraya tasir
//        }
//
//        if(curr1==null) tail.next = curr2; // bir dizi digerinden kisaysa burda "digerinin kalanini ekle" yapilir
//        else tail.next = curr1;
//
//        return dummy.next; // dummy nodu umuz gorevini yerine getirdi. burda dummy nin next i asil head.
//    }
//}