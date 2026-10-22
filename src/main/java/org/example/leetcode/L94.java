package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L94 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root==null) {
            return new ArrayList<>();
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }




}
