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
    static long max=0;
    static int mod=(int)(1e9+7);
    public static long val(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        long left=val(root.left);
        long right=val(root.right);
        return left+right+root.val;
    }
    public static long val(TreeNode root,long sum)
    {
        if(root==null)
        {
            return 0;
        }
        
        long left=val(root.left,sum);
        long right=val(root.right,sum);
        long val=sum-(left+right+root.val);
        max=Math.max(max,val*(left+right+root.val));
        return left+right+root.val;
    }
    public int maxProduct(TreeNode root)
    {
        long sum=val(root);
        max=0;
        long total=val(root,sum);
        return (int)(max%mod);
    }
}