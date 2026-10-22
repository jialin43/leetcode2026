package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L56 {
    public static int[][] merge(int[][] a) {
        int n= a.length;
        List<int[]> list=  new ArrayList<>();
        int index = 0;
        Arrays.sort(a, Comparator.comparingInt(x->x[0]));
        int l = a[0][0],r = a[0][1];
        for (int i=1;i<n;i++) {
            if(a[i][0]<=r) {

                r = Math.max(r,a[i][1]);
            }else {
                list.add( new int[]{l,r});
                l = a[i][0];
                r = a[i][1];
            }
        }
        list.add(new int[]{l,r});
        int[][] res = new int[list.size()][];

        for (int[] x:list) {
            res[index++] = x;
        }
        return res;

    }

    public static void main(String[] args) {

    }
}
