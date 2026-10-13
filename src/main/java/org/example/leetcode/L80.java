package org.example.leetcode;

public class L80 {
    public static int removeDuplicates(int[] nums) {
        int total = nums.length;

        for(int i=0,j=0;i<total;i++) {
            if(j<2 || (nums[j-1] !=nums[i] || nums[j-2] != nums[i])) {
                nums[j] = nums[i];
                j++;

            }

        }
        return total;
    }

    public static void main(String[] args) {
        int[] x = new int[] {1,1,1,2,2,3};
           int res =  removeDuplicates(x);
        System.out.println(res);
    }
}
