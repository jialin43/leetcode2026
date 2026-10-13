package org.example.leetcode;

import java.util.HashMap;

public class L76 {
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        HashMap<Character,Integer> ht = new HashMap<>();

        for (int i=0;i<t.length();i++) {
           ht.put(t.charAt(i),ht.getOrDefault(t.charAt(i),0)+1);
        }

        int count = 0;
        String res = "";
        for (int i=0,j=0;i<s.length();i++) {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);

            if( hs.getOrDefault(s.charAt(i),0)<=ht.getOrDefault(s.charAt(i),0)) {
                count++;
            }

            while (j<=i && hs.getOrDefault(s.charAt(j),0)>ht.getOrDefault(s.charAt(j),0)) {
                hs.put(s.charAt(j),hs.get(s.charAt(j))-1);
                j++;
            }
            if(count==t.length()) {
                if(res.isEmpty() || i-j+1<res.length()) {
                    res = s.substring(j,i+1);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s1=  "ADOBECODEBANC";
        String s2 = "ABC";
        String res = minWindow(s1, s2);
        System.out.println(res);
    }
}
