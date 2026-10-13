package org.example.leetcode;

public class L35 {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;

        int l=0,r=n;



        while (l<r) {
            int m = (l+r)/2;

            if(target>nums[m]) {
                l = m+1;
            }else if(target<=nums[m]) {
                r = m;
            }

        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,6};
        int res = searchInsert(arr, 2);
        System.out.println(res);
    }
}
