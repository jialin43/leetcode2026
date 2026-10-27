package org.example.leetcode;

public class L75 {
    public void sortColors(int[] nums) {

        int n = nums.length;
        for (int i=0,j=0,k=n-1;i<=k;) {
            if(nums[i]==0) {
                int t = nums[i];
                nums[i++] = nums[j];
                nums[j++] = t;
            }else if(nums[i]==2) {
                int t = nums[i];
                nums[i] = nums[k];
                nums[k--] = t;
            }else {
                i++;
            }
        }
    }
}
