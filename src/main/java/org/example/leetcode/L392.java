package org.example.leetcode;

public class L392 {
    public static boolean isSubsequence(String s, String t) {
        int k=0;
        for (int i=0;i<t.length();i++) {
            if(k<s.length() && s.charAt(k)==t.charAt(i)) {
                k++;
            }


        }
        if(k==s.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        boolean res = isSubsequence("axc","ahbgdc") ;
        System.out.println(res);
    }
}
