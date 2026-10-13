package org.example.leetcode;

public class L274 {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int hMax = 1;
        for (int h=1;h<=n;h++) {
            int cnt = 0;
            for (int i=0;i<n;i++) {

               if(citations[i]>=h) {
                   cnt ++;
               }
            }
            if(cnt >=h) {
                hMax = h;
            }
        }
        return hMax;
    }

    public static void main(String[] args) {

    }
}
