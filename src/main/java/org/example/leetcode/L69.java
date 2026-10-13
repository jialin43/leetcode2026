package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class L69 {
    public static int majorityElement(int[] nums) {
        int score=  0;
        int flag = 0;

        for (int i=0;i<nums.length;i++) {
            if(score==0) {
                score = nums[i];
                if(score==nums[i]) {
                    flag++;
                }else {
                    flag--;
                }
            }
        }
        return flag;
    }
}
