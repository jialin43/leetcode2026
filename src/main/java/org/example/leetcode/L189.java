package org.example.leetcode;

public class L189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // 1,2,3,4,5 321 54
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }

    private static void swap(int[] nums,int i,int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }

    private static void reverse(int[] nums,int l,int r) {
        while (l<r) {
            swap(nums,l,r);
            l++;
            r--;
        }
    }

}
