package org.example.xingye;

import java.util.Stack;

public class Main {
    public boolean matchBrackets (String text) {
        // write code here
        String[] array = text.split("");
        if(array.length<=1) {
            return false;
        }
        Stack<Character> stk = new Stack<>();

        for (String x:array) {
            char c = x.toCharArray()[0];
            if(c=='(' || c=='[') {
                stk.push(c);
            }else {
                Character t = stk.pop();
                if(Math.abs(t-c)>2) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int test() {
        int x= 5;
        try {
            ++x;
            return x;
        }catch (Exception e) {

        }finally {
            ++x;
        }
        return 1;
    }
    public static void main(String[] args) {
        int test = test();
        System.out.println(test);
    }
}
