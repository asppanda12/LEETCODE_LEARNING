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
    
    public String tree2str(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        String left=tree2str(root.left);
        String right=tree2str(root.right);
        // System.out.println(left+" "+right+" "+root.val);
        String s1="";
        if(left==null && right==null)
        {
            s1=s1+Integer.toString(root.val);
        }
        else
        if(right==null)
        {
            s1=s1+Integer.toString(root.val)+"("+left+")";
        }
        else
        if(left==null)
        {
            s1=s1+Integer.toString(root.val)+"("+")"+"("+right+")";
        }
        else
        {
            
            s1=s1+Integer.toString(root.val)+"("+left+")"+"("+right+")";
        }
        return s1;
    }
    
}