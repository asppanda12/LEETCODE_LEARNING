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
class Solution 
{
    public static boolean val(TreeNode root,long min,long max)
    {
        if(root==null)
        {
            return true;
        }
        boolean left=false;boolean right=false;
        if(root.val<max &&  root.val>min)
        {
           left=val(root.left,min,root.val);
           right=val(root.right,root.val,max);
        }
        return left&right;
    }
    public boolean isValidBST(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        return val(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}