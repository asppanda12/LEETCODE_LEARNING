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
    public TreeNode bstFromPreorder(int[] preorder) 
    {
        ArrayList<Integer> left=new ArrayList<Integer>();
        ArrayList<Integer> right=new ArrayList<Integer>();
        int root_va=preorder[0];
        TreeNode root=new TreeNode(root_va,null,null);
        for(Integer ap:preorder)
        {
            if(root_va<ap)
            {
                right.add(ap);
            }
            else
            if(root_va>ap)
            {
                left.add(ap);
            }
        }
        for(Integer l:left)
        {
            insert(root,l);
        }
         
        for(Integer r:right)
        {
            insert(root,r);
        }   
         
        return root;
    }
    public TreeNode insert(TreeNode root,int val)
    {
        if(root==null)
        {
            
            TreeNode root1=new TreeNode(val,null,null);
            return root1;
        }
        if(root.val>val)
        {
            root.left=insert(root.left,val);
        }
        if(root.val<val)
        {
            root.right=insert(root.right,val);
        }
      return root;
    }
    
}