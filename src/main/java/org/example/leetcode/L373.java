package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class L373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int a=0,b=0;
        PriorityQueue<int[]> p = new PriorityQueue<>();
        for (int i=0;i<k;i++) {
            List<Integer> list = new ArrayList<>();
            list.add(nums1[a]);
            list.add(nums2[b]);
            if(nums1[a] <nums2[b]) {
                b++;
            }else {
                a++;
            }
            res.add(list);
        }
        return res;
    }
}
