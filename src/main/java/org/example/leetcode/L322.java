package org.example.leetcode;

public class L322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+10];
        for(int i=0;i<=amount+1;i++) {
            dp[i] = 100000;
        }
        dp[0] = 0;
        for (int x:coins) {
            for (int i=x;i<=amount;i++) {
                dp[i] = Math.min(dp[i],dp[i-x]+1);
            }
        }
        return dp[amount]==100000?-1:dp[amount];
    }
}
