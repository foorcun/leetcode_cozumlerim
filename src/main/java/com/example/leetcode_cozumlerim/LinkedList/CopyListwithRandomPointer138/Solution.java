//package com.example.leetcode_cozumlerim.CopyListwithRandomPointer138;
//
///*
//// Definition for a Node.
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//*/
//
//class Solution {
//    public Node copyRandomList(Node head) {
//
//        // base case
//        if(head == null ){
//            return head;
//        }
//
//        Map<Node,Node> hashNode = new HashMap<>();
//
//        Node p =head;
//        while(p!=null){ // tum nodelarin olusturulmasi
//            Node copyNode = new Node(p.val);
//            hashNode.put(p,copyNode);
//            p= p.next;
//
//        }
//
//        p=head;
//        while(p!=null){ // clone Node larin next ve random degerlerinin doldurulmasi
//            Node copy = hashNode.get(p);
//            copy.next = hashNode.get(p.next);
//            copy.random = hashNode.get(p.random);
//
//            p = p.next;
//
//        }
//
//        return hashNode.get(head);
//    }
//}