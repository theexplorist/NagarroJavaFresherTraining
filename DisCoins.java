/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int moves = 0;
    public int distributeCoins(TreeNode root) {
        moves = 0;
        helper(root);
        return moves;
    }
    
    public int helper(TreeNode root) {
        
        if(root == null) {
            return 0;
        }
        
        root.val += helper(root.left);
        root.val += helper(root.right);
        
        int temp = root.val - 1;
        moves += Math.abs(temp);
        return temp;
    }
}
