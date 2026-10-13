package org.example.leetcode;

import java.util.Objects;

public class L03 {
    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("abcabcbb");
//        int res = lengthOfLongestSubstring("pwwkew");
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[500];
        int l=0,r=0;
        int res = -1;
        int len = s.length();
        if(len==0) {
            return 0;
        }
        while (l<len && r<len) {
           if(hash[s.charAt(r)]==0) {
               hash[s.charAt(r)]++;
               r++;
               res = Math.max(res,r-l);
           }else {
               hash[s.charAt(l)]--;
               l++;
           }
        }
        return res;
    }

}
