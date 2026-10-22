package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int len = p.length();
        char[] charArray = p.toCharArray();
        Arrays.sort(charArray);
        p = new String(charArray);
        for (int i=0;i<s.length()-len;i++) {
            String temp = s.substring(i, i + len);
            char[] tempCharArray = temp.toCharArray();
            Arrays.sort(tempCharArray);
            temp = new String(tempCharArray);
            if(p.equals(temp)) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }
}
