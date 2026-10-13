package org.example.leetcode;

public class L300 {
    public int lengthOfLIS(int[] nums) {
        int t = nums[0];
        int count = 1;
        for (int i=1;i<nums.length;i++) {
            if(nums[i] >t) {
                t = nums[i];
                count++;
            }
        }
        return count;
    }
}
