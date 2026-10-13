package org.example.leetcode;

public class L121 {
    public static int maxProfit(int[] prices) {
        int res = 0;

        int min = prices[0];
        for (int i=0;i<prices.length;i++) {
            min =  Math.min(min,prices[i]);
            int c = prices[i]-min;
            res = Math.max(res,c);
        }


        return res;
    }

    public static void main(String[] args) {

    }
}
