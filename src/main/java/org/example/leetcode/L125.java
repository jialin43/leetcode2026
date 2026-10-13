package org.example.leetcode;

public class L125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i=0,j=s.length()-1;i<j;i++,j--) {
            while (i<j && !check(s.charAt(i)) ) i++;
            while (i<j && !check(s.charAt(j)) ) j--;

            if(i<j && s.charAt(i)!=s.charAt(j)) {
                return false;
            }

        }
        return true;
    }
    boolean check(char s) {
        if(s>='a' && s<='z' || s>='A' && s<='Z' || s>='0' && s<='9') {
            return true;
        }
        return false;
    }
}
