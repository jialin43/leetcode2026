package org.example.leetcode;

public class L27 {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int c=0;
        for (int i=0;i<n;i++) {
            if(nums[i] !=val) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,2,3,0,4,2};

        int res =removeElement(a,2);
        System.out.println(res);
    }
}
