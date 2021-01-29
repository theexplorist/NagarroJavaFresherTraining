package com.nagarro.codingblocks.java.day5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class RightSideView {
	
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

	static int maxLevel;
	static List<Integer> ans;

	public List<Integer> rightSideView(TreeNode root) {
		maxLevel = 0;
		ans = new ArrayList<>();
		
		helper(root, 1);
		return ans;
	}

	private void helper(TreeNode root, int currLvl) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}

		if (maxLevel < currLvl) {
			ans.add(root.val);
			maxLevel = currLvl;
		}
		
		helper(root.right, currLvl + 1);
		helper(root.left, currLvl + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
