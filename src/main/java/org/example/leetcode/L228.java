package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L228 {
    public static List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();
        for (int i=0;i<n;) {

            int start = nums[i];
            int x= start;
            while(i<n && nums[i]==x) {
                i++;
                x++;
            }
            int end = x-1;
            if(start==end) {
                res.add(String.valueOf(start));
            }else {
                res.add(start+"->"+end);
            }
        }
        return res;
    }
}
