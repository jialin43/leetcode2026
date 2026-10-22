package org.example.leetcode;

import java.util.HashMap;

public class L560 {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int[] s = new int[n+1];
        for (int i=1;i<=n;i++) {
            s[i] = s[i-1]+nums[i-1];
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        for (int i=1;i<=n;i++) {
            res = res+hash.getOrDefault(s[i]-k,0);
            hash.put(s[i],hash.getOrDefault(s[i],0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int res = subarraySum(new int[]{1, 1, 1}, 2);
        System.out.println(res);
    }
}
