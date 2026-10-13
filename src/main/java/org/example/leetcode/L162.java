package org.example.leetcode;

public class L162 {
    public static int findPeakElement(int[] nums) {
        for (int i=1;i<nums.length-1;i++) {
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]) {
                return i;
            }
            if(nums[i+1] >nums[i] && i== nums.length-1) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        findPeakElement(arr);
    }
}
