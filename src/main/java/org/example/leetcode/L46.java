package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L46 {
    int n = 0;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path;
    boolean[] st;

    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        st = new boolean[n];
        path = new ArrayList<>();
        dfs(nums, 0);
        return res;
    }

    void dfs(int[] nums, int u) {
        if (u == n) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!st[i]) {
                path.add(nums[i]);
                st[i] = true;
                dfs(nums, u + 1);
                st[i] = false;
                path.remove(path.size() - 1);
            }

        }


    }

}
