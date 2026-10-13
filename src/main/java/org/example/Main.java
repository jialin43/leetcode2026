package org.example;


import com.google.common.util.concurrent.RateLimiter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static class Node {
        int val;
        Node left;
        Node right;
        Node(int x) {
            this.val = x;
        }
    }
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    int index=0;
    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(1);

        for (int i=0;i<100;i++) {
            double acquire = rateLimiter.acquire();
            threadLocal.set("234");
            System.out.println("等待时间："+acquire);
            System.out.println(threadLocal.get());
        }
    }


}