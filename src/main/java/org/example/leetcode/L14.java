package org.example.leetcode;

public class L14 {
    public static String longestCommonPrefix(String[] strs) {


        StringBuilder res = new StringBuilder();
        if(strs.length==0) return res.toString();

        for (int i=0;;i++) {
            if(i>=strs[0].length()) {
                return res.toString();
            }
            char x = strs[0].charAt(i);

            for (String s:strs) {
                if(i>=s.length() ||s.charAt(i) !=x ) {
                    return res.toString();
                }
            }
           res.append(x);
        }

//        return res.toString();


    }

    public static void main(String[] args) {
        String[] strs = new String[]{"cir","car"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
}
