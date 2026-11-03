package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root==null) {
            return res;
        }

        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<n;i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if(poll.left!=null) {
                    queue.add(poll.left);
                }
                if(poll.right!=null) {
                    queue.add(poll.right);
                }


            }
            res.add(list);
        }
        return res;
    }
}
