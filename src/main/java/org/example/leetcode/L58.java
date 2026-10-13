package org.example.leetcode;

public class L58 {
    public static int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        for (int i=stringArray.length-1;i>=0;i--) {
            if(stringArray[i].isEmpty()) {
                continue;
            }else {
                return stringArray[i].length();
            }
        }
        return 0;
    }
}
