package org.example.leetcode;

public class L226 {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    void dfs(TreeNode treeNode) {
        if(treeNode==null) {
            return ;
        }
        dfs(treeNode.left);
        dfs(treeNode.right);
        TreeNode t = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = t;


    }
}
