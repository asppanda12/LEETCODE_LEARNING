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
    public static void val(TreeNode root,String s,TreeSet<String> set)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            s+=(char)(root.val+97);
            StringBuffer sb=new StringBuffer(s);
            sb.reverse();
            set.add(sb.toString());
        }
        val(root.left,s+(char)(root.val+97),set);
        val(root.right,s+(char)(root.val+97),set);
    }
    public String smallestFromLeaf(TreeNode root) {
        TreeSet<String> ts=new TreeSet<String>();
        val(root,"",ts);
        System.out.println(ts);
        return ts.first();
    }
}