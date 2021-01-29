package com.nagarro.codingblocks.day8;

public class ValidBST {

	
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
	 
	public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
	
	public boolean isValidBST(TreeNode root, long minRange, long maxRange) {
        
		if(root == null) {
			return true;
		}
		
		if(root.val <= minRange || root.val >= maxRange) {
			return false;
		}
		boolean left = isValidBST(root.left, minRange, root.val);
		boolean right = isValidBST(root.right, root.val, maxRange);
		
		return left && right;
    }
}
