package org.example.leetcode;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class L42 {
    public  static int trap(int[] height) {
        Stack<Integer> stk = new Stack<>();
        int res = 0;
        for (int i=0;i<height.length;i++) {
            int last = 0;
            while (!stk.empty() && height[stk.peek()]<=height[i]) {
                res = res + (height[stk.peek()]-last )* (i-stk.peek()-1);

                last = height[stk.peek()];
                stk.pop();

            }
            if(!stk.empty()) {
                res = res + (height[i]-last) * (i-stk.peek()-1);
            }
            stk.push(i);
        }
        return  res;
    }

    public static void main(String[] args) {
        int n=0;
        int array[] = new int[10000];

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        n = sc.nextInt();

        for (int i=0;i<n;i++) {
            array[i] = sc.nextInt();

        }


        for (int i=0;i<n;i++) {
            while (!stk.empty() && stk.peek()>=array[i]) {
                stk.pop();
            }
            if(stk.empty()) {
                System.out.print("-1 ");

            }else {
                System.out.print(stk.peek()+" ");

            }
            stk.push(array[i]);
        }

    }
}
