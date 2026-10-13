package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<String,Integer> hash = new HashMap<>();

        String[] split = magazine.split("");
        for (String s:split) {
            if(hash.containsKey(s)) {
                hash.put(s,hash.get(s)+1);
            }else {
                hash.put(s,1);
            }
        }

        String[] maga = ransomNote.split("");
        for (String s:maga) {
            if(hash.containsKey(s)) {
                Integer count = hash.get(s);
                if(count<1) return false;
                count--;
                hash.put(s,count);
            }else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

    }
}
