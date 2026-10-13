package org.example.leetcode;

public class L145 {
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static boolean checkSymmetricTree(TreeNode root) {

        if (root==null) return true;
        return dfs(root.left,root.right);
    }

    public static  boolean dfs(TreeNode left,TreeNode right) {


        if(left==null){
            if(right==null){
                return true;
            }else {
                return false;
            }
        }

        if(right==null) {
            if(left==null) {
                return true;
            }else {
                return false;
            }
        }

        if(left.val !=right.val) {
           return false;
        }

        return dfs(left.left,right.right) && dfs(left.right,right.left);

    }

}
