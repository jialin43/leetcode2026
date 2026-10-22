package org.example.leetcode;

public class L108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    TreeNode build(int[] nums,int l,int r) {
        if(l>r) return null;
        int m = l+r >>1;
        TreeNode root = new TreeNode(nums[m]);
        root.left = build(nums,l,m-1);
        root.right = build(nums,m+1,r);
        return root;
    }
}
