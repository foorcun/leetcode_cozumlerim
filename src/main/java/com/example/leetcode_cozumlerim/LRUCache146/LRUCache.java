package com.example.leetcode_cozumlerim.LRUCache146;


import java.util.HashMap;
import java.util.Map;

class DoublyListNode{ // Doubly Linked List class
    int key;
    int value;
    DoublyListNode prev;
    DoublyListNode next;

}

class LRUCache {

    private Map<Integer, DoublyListNode> cache = new HashMap<>(); // HashMap for cache storing
    private int capacity; // capacity
    private DoublyListNode head; // Dummy head  pointer node
    private DoublyListNode tail; // Dummy tail pointer node

    public LRUCache(int capacity) {

        this.capacity = capacity;
        head = new DoublyListNode(); // Dummy head  pointer node
        tail = new DoublyListNode(); // Dummy tail pointer node

        head.next = tail;
        tail.prev = head;
    }

    //addNodeToHead
    private void addNodeToHead(DoublyListNode node){
        DoublyListNode  prev = head; // dummy head pointer
        DoublyListNode next = head.next;

        prev.next =node; // dummyHead -> newHead
        node.prev =prev; // dummyHead <- newHead

        next.prev =node; // newHead <- oldHead
        node.next =next; // newHead -> oldHead

    }

    //Remove an existing node from LinkedList
    private void removeNode(DoublyListNode node){
        DoublyListNode prev = node.prev; //
        DoublyListNode next = node.next;

        prev.next = prev.next.next; // ya da prev.next = next;
        next.prev = next.prev.prev; // ya da next.prev = prev;

        node.prev = null;
        node.next=null;
    }

    //move an existing node to head
    public void moveToHead(DoublyListNode node){
        removeNode(node); // node u LinkedList ten kopartir.
        addNodeToHead(node); // addNodeToHead
    }

    // Pop tail node
    public DoublyListNode removeTailNode(){
        DoublyListNode res = tail.prev; // burdaki Tail, dummy tail pointer node
        removeNode(res);
        return res;

    }

    public int get(int key) {
        DoublyListNode node =  cache.get(key); // cache HashMap ten veri okuma yapiliyor
        if(node == null){ // null okursa return -1
            return -1;
        }
        moveToHead(node);
        return node.value;

    }

    public void put(int key, int value) {

        DoublyListNode node = cache.get(key);

        if(node == null){
            DoublyListNode newNode = new DoublyListNode();
            newNode.key=key;
            newNode.value = value;

            cache.put(key,newNode);
            addNodeToHead(newNode);

            if(cache.size() > capacity){
                //delete the tail
                DoublyListNode tail = removeTailNode();
                cache.remove(tail.key);
            }
        }else {
            //update the value
            node.value= value;
            moveToHead(node);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


