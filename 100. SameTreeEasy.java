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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //left root right
        
        //base case
        
        if(p == null || q == null){
            return  p==q;
        }
        
        if(p.val!=q.val){
            return false;
        }
        
        // boolean right= isSameTree(p.right,q.right);
        // boolean  left= isSameTree(q.left,q.left); 
        // return right && left;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right)); 
    }
}
