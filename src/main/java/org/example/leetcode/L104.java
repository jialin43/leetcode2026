package org.example.leetcode;

public class L104 {
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    public static int dfs(TreeNode root) {
        if(root==null) {
            return 1;
        }
        return Math.max(dfs(root.left),dfs(root.right))+1;

    }
}
