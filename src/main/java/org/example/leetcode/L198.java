package org.example.leetcode;

public class L198 {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];

        dp[0] = nums[0];
        for (int i=1;i<=n;i++) {
           if(i<2) {
               dp[i] = Math.max(dp[i-1],nums[i]);
           }else {
               dp[i] = Math.max(dp[i],dp[i-2]+nums[i]);
           }
        }
        return dp[n-1];
    }
}
