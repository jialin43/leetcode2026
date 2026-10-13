package org.example.leetcode;

import java.util.ArrayList;

public class L70 {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ");

        ArrayList<String> list = new ArrayList<>();
        for (int i=array.length-1;i>=0;i--) {
            if(!"".equals(array[i])) {
                if(i>0 ) {
                    sb.append(array[i]).append(" ");
                }else {
                    sb.append(array[i]);
                }
            }
        }
        if(sb.lastIndexOf(" ")==sb.length()-1) {
            sb.deleteCharAt(sb.lastIndexOf(" "));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
