package org.example.leetcode;

import java.util.Stack;

public class L20 {
    public boolean isValid(String s) {
        String[] split = s.split("");
        Stack<String> stack = new Stack<>();

        for (String x:split) {
            if(x.equals("(") || x.equals("[") || x.equals("{")) {
                stack.push(x);
            }else {
                if(stack.empty()) {
                   return false;
                }
                String pop = stack.pop();
                if(Math.abs(x.toCharArray()[0]-pop.toCharArray()[0])>2) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
