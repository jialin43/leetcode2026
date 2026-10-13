package org.example.leetcode;

import java.util.HashSet;

public class L128 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x:nums) {
            set.add(x);
        }

        int res = 0;
       for (int x:nums) {
           if(set.contains(x) && !set.contains(x-1)) {
               int y = x;
               set.remove(x);
               while (set.contains(y+1)) {
                    y++;
                   set.remove(y);
               }

               res = Math.max(res,y-x+1);
           }
       }
       return res;
    }
    public static void main(String[] args) {
        longestConsecutive(new int[] {100,4,200,1,3,2});
        System.out.println();
    }
}
