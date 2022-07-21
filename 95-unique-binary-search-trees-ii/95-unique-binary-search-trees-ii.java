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
    public static List<TreeNode> make_bst(int i,int j)
    {
        if(i>j)
        {
            List<TreeNode> ls=new ArrayList<TreeNode>();
            ls.add(null);
            return ls;
        }
        List<TreeNode> root=new ArrayList<TreeNode>();
        for(int k=i;k<=j;k++)
        {
            List<TreeNode> left=make_bst(i,k-1);
            List<TreeNode> right=make_bst(k+1,j);
            for(TreeNode l:left)
            {
                for(TreeNode r:right)
                {
                    TreeNode rp=new TreeNode(k,l,r);
                    root.add(rp);
                }
            }
        }
        return root;
    }
    public List<TreeNode> generateTrees(int n) 
    {
        List<TreeNode> root=make_bst(1,n);
        return root;
        
    }
}