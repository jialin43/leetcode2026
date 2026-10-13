package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n;i++) {
            int l = i+1;
            int r = n-1;
            if(i!=0 && nums[i-1]==nums[i]) continue;
            while (l<r) {
                int sum =nums[i]+nums[l]+nums[r];

                if(sum >0) {
                    r--;
                    continue;
                }
                if(sum<0) {
                    l++;
                    continue;
                }
                res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                do {
                    l++;
                }while (l<r && nums[l]==nums[l-1]);
                do {
                    r--;
                }while (l<r && nums[l]==nums[r+1]);
            }
        }
        return res;
    }
}
