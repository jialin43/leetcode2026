package org.example.leetcode;

public class L26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i=1;i<n;i++) {
          if(nums[c] !=nums[i]) {
              nums[++c] = nums[i];
          }
        }
        return c+1;

    }
}
