package org.example.leetcode;

public class L88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         *  1 4 6 0 0 0
         *
         *  2 3 5
         *
         *  2 4 6
         *  1 3 5
         *
         *  1 4 6
         *
         *  2 3 5
         */

       int c = m+n-1;

       int p = m-1;
       int q = n-1;

       while (p>=0 &&q>=0) {
           if(nums1[p]>nums2[q]) {
               nums1[c] = nums1[p];
               c--;
               p--;
           }else {
               nums1[c] = nums2[q];
               c--;
               q--;
           }
       }
       while (q>=0) {
           nums1[c--]  = nums2[q--];
       }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 6,0,0,0};
        int[] b = new int[]{1, 3, 5};
        merge(a,3,b,3);

        System.out.println("1");
    }
}
