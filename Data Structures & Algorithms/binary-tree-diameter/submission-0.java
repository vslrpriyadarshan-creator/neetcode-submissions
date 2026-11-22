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
    int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        findMaxDiameter(root);
        return maxDiameter;

    }

    public int findMaxDiameter( TreeNode root){

        if( root == null){
            return 0;
        }
 
        int left = findMaxDiameter(root.left);
        
        int right = findMaxDiameter(root.right);

        maxDiameter = Math.max(maxDiameter, right + left);

        return 1 + Math.max( left ,right);
    }
}
