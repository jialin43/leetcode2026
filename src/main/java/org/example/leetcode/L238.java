package org.example.leetcode;

public class L238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            p[i] = 1;
        }
        for (int i=1;i<nums.length;i++) {
            p[i] = p[i-1] *nums[i-1];
        }

        for (int i=nums.length-1,s=1;i>=0;i--) {
            p[i] = p[i]*s;
            s = s*nums[i];
        }
        return p;
    }
}
