package com.example.leetcode_cozumlerim.Stack.EvaluateReversePolishNotation150;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {

        public  static int evalRPN(String[] tokens) {

            Stack<String> stackN = new Stack();

            Set<String> operations = new HashSet<>();
            operations.add("+");
            operations.add("-");
            operations.add("*");
            operations.add("/");



            for(int i =0 ; i < tokens.length;i++){

                if(operations.contains(tokens[i])){

                    String b;
                    String a;

                    b=stackN.peek();
                    stackN.pop();
                    a=stackN.peek();
                    stackN.pop();

                    String result = operate(a,b, tokens[i]);

                    stackN.push(result);


                }else{

                    stackN.push(tokens[i]);

                }





            }




            return Integer.valueOf(stackN.peek());

        }

        private static String operate(String a, String b, String operation){


            if(operation=="+") return Integer.toString(Integer.valueOf(a)+Integer.valueOf(b));
            else if(operation=="-") return Integer.toString(Integer.valueOf(a)-Integer.valueOf(b));
            else if(operation=="*") return Integer.toString(Integer.valueOf(a)*Integer.valueOf(b));
                //if(operation=="/") return Integer.toString(Integer.valueOf(a)/Integer.valueOf(b));
            else{ return Integer.toString(Integer.valueOf(a)/Integer.valueOf(b));}


        }
    }