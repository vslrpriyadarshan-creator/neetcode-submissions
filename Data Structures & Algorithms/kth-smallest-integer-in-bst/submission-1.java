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
    public int kthSmallest(TreeNode root, int k) {
        return findKthSmallest(root,new int []{k});
    }

    public int findKthSmallest(TreeNode root, int[] count){

        if(root == null){
            return -1;
        }

        int left = findKthSmallest(root.left,count);

        if(left != -1){
            return left;
        }
        count[0]--;
        if(count[0] == 0){
            return root.val;
        }

        return findKthSmallest(root.right,count);
         
    }
}
