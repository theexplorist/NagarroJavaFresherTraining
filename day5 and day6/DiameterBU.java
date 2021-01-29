package com.nagarro.codingblocks.java.day5;

import com.nagarro.codingblocks.day8.ValidBST.TreeNode;

public class DiameterBU {

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
	
	class DiaPair {
		int ht, dia;

		public DiaPair(int ht, int dia) {
			this.ht = ht;
			this.dia = dia;
		}
	}

	public DiaPair diameterOfBinaryTree(TreeNode root) {
		if(root == null) {
			return new DiaPair(0, 0);
		}
		
		DiaPair left = diameterOfBinaryTree(root.left);
		DiaPair right = diameterOfBinaryTree(root.right);
		
		int height = Math.max(left.ht, right.ht) + 1;
		int diameter = Math.max(left.ht + right.ht, Math.max(left.dia, right.dia));
		
		return new DiaPair(height, diameter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
