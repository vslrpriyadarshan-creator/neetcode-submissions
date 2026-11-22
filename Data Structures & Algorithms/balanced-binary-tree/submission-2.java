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
    boolean isBalanced;
    public boolean isBalanced(TreeNode root) {   
        isBalanced = true;
        checkBalance(root);

        return isBalanced;
        
    }

    public int checkBalance(TreeNode root){
            
            if(root == null || !isBalanced){

                return 0;
            }

            int left = checkBalance(root.left);

            int right = checkBalance(root.right);

            if(Math.abs(left-right) > 1){

                isBalanced = false;
            }

            return 1 + Math.max(left,right);
    }
}
