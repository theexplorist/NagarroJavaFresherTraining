package com.nagarro.codingblocks.java.day5;

import com.nagarro.codingblocks.day8.ValidBST.TreeNode;

public class MaxDepthOFBT {
	
	public class TreeNode {
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
	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}

	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int lH = maxDepth(root.left);
		int rH = maxDepth(root.right);
		
		int diaRoot = lH + rH;
		
		int lD = diameterOfBinaryTree(root.left);
		int rD = diameterOfBinaryTree(root.right);
		
		return Math.max(diaRoot, Math.max(lD, rD));
	}
}
