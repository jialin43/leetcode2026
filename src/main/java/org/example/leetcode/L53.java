package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L53 {
    //    public static int maxSubArray(int[] nums) {
//        int n = nums.length;
//        int res = Integer.MIN_VALUE;
//        int last = 0;
//        for (int i=0;i<n;i++) {
//            last = nums[i]+Math.max(last,0);
//            res = Math.max(res,last);
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int rs = maxSubArray(new int[] {-2,-1
//        });
//        System.out.println(rs);
//    }
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int m = matrix.length;
            if(matrix.length==0) {
                return res;
            }
            int n = matrix[0].length;

            int[] dx = new int[] {0,1,0,-1};
            int[] dy = new int[] {1,0,-1,0};

            boolean[][] st = new boolean[m][n];

            for (int i=0,x=0,y=0,d=0;i<m*n;i++) {
                res.add(matrix[x][y]);
                st[x][y] = true;
                int a = x+dx[d];
                int b = y+dy[d];

                if(a<0 || a>=m || b<0 || b>=n || st[a][b]) {
                    d=(d+1) %4;
                    a = x+dx[d];
                    b = y+dy[d];
                }
                x=  a;
                y =b;
            }
            return res;
        }
    }
}
