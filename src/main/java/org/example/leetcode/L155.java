package org.example.leetcode;

import java.util.Stack;

public class L155 {
    Stack<Integer> stk;
    Stack<Integer> minStk;
    public L155() {
        stk = new Stack<>();
        minStk = new Stack<>();
    }

    public void push(int value) {
       stk.push(value);
       if(minStk.empty()) {
           minStk.push(value);
       }else {
           minStk.push(Math.min(minStk.lastElement(),value));
       }
    }

    public void pop() {
       stk.pop();
       minStk.pop();

    }

    public int top() {

        return stk.peek();
    }

    public int getMin() {
        return minStk.peek();
    }
}
