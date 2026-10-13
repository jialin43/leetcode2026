package org.example.leetcode;

public class L11 {
    public static int maxArea(int[] height) {
        int n = height.length;
        int res = 0;
        int i=0,j=n-1;
        while (i<j) {
            int area = Math.min(height[i],height[j]) * (j-i);
            res = Math.max(res,area);
            if(height[i]>height[j]) {
                j--;
            }else {
                i++;
            }

        }


        return res;
    }

    public static void main(String[] args) {
        int i = maxArea(new int[]{1, 1});
        System.out.println();
    }
}
