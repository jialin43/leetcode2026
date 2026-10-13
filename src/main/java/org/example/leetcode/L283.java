package org.example.leetcode;

public class L283 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j=0;
        for (int i=0;i<n;i++) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }


        }
        while (j<n) {
            nums[j++] = 0;
        }
    }
    public static void swap(int[] nums,int i,int j) {
        int t = nums[i];
        nums[i]  = nums[j];
        nums[j] = t;
    }
}
