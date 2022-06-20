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
    
    public void flatten(TreeNode root) 
    {
        TreeNode curr=root;
       
        while(curr!=null)
        {
         if(curr.left!=null)
            {
            TreeNode next1=curr.left;
            while(next1.right!=null)
            {
                next1=next1.right;
            }
            next1.right=curr.right;
            curr.right=curr.left;
            curr.left=null;
           }
            curr=curr.right;
        }
        
    }
}