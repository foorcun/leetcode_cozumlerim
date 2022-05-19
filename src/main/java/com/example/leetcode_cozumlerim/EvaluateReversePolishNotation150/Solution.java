package com.example.leetcode_cozumlerim.EvaluateReversePolishNotation150;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        return calculate(stack, 0, tokens);
    }

    private static int calculate(Stack<Integer> stack, int i, String[] tokens) {
        if (i == tokens.length) {
            return stack.pop();
        }
        String current = tokens[i];
        if(current.equals("+") || current.equals("/") || current.equals("*") || current.equals("-") &&
                stack.size() >= 2) {
            int a = stack.pop();
            int b = stack.pop();
            int c = 0;
            switch (current) {
                case "+":
                    c = b + a;
                    break;
                case "-":
                    c = b - a;
                    break;
                case "*":
                    c = b * a;
                    break;
                case "/":
                    c = b / a;
                    break;
            }
            stack.push(c);
        }
        else {
            stack.push(Integer.valueOf(current));
        }
        return calculate(stack, i + 1, tokens);
    }
}