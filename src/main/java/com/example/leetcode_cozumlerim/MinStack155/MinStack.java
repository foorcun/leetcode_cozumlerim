package com.example.leetcode_cozumlerim.MinStack155;

import java.util.Stack;

class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;


    public MinStack() {
        mainStack = new Stack();
        minStack = new Stack();

    }

    public void push(int val) {
        mainStack.push(val);
        if(!minStack.isEmpty()){
            if(minStack.peek() > val) minStack.push(val);
            else minStack.push(minStack.peek());
        }else{
            minStack.push(val);
        }


    }

    public void pop() {
        mainStack.pop();
        minStack.pop();

    }

    public int top() {
        return   mainStack.peek();

    }

    public int getMin() {
        return    minStack.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */