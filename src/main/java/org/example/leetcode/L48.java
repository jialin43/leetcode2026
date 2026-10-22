package org.example.leetcode;

public class L48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // 先沿着正对角线交换，再左右交换

        for (int i = 0; i < n; i++) {
            for (int j=0;j<i;j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        // left and right swap
        for (int i=0;i<n;i++) {
            for (int j=0,k=n-1;j<=k;j++,k--) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = t;
            }
        }
    }



    public static void main(String[] args) {

    }
}
