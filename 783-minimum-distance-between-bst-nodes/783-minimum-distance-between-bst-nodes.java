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
     public static void val(TreeNode root,ArrayList<Integer> ar)
    {
        if(root==null)
        {
            return;
        }
        val(root.left,ar);
        ar.add(root.val);
        val(root.right,ar);
    }
    public int minDiffInBST(TreeNode root)
    {
         ArrayList<Integer> arr=new ArrayList<Integer>();
        val(root,arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++)
        {
           min=Math.min(min,arr.get(i)-arr.get(i-1));
        }
        return min;
        
    }
}