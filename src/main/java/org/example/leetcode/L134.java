package org.example.leetcode;

public class L134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;

        for (int i=0,j;i<n;) {
            int left = 0;

            for (j=0;j<n;j++) {
                int k = (i+j) %n;

                left = left +gas[k]-cost[k];

                if(left<0) {
                    break;
                }

            }
            if(j==n) {
                return i;
            }
            i = i+j+1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
