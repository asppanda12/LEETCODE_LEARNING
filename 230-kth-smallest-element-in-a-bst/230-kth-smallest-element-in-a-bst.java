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

    public int kthSmallest(TreeNode root, int k) 
    {
        //Moris Traversal
        int no=0;
        TreeNode cur=root;
        while(cur!=null)
        {
           
            if(cur.left==null)
            {
                no++;
                if(no==k)
                {
                    return cur.val; 
                }
                 System.out.println(cur.val);
                cur=cur.right;
            }
            else
            {
                TreeNode pre=cur.left;
                while(pre.right!=null &&  pre.right!=cur)
                {
                    pre=pre.right;
                }
                if(pre.right==null)
                {
                    pre.right=cur;
             
                    cur=cur.left;
                }
                else
                {
                    pre.right=null;
                    no++;
                              if(no==k)
                {
                    return cur.val; 
                }

                    cur=cur.right;
                }
            }
        }
        return -1;
        
    }
}