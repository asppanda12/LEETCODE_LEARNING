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
    ArrayList<Integer> arr;
    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);        
    }
    public boolean findTarget(TreeNode root, int k) 
    {
       arr=new ArrayList<Integer>();
        inorder(root);
        int low=0;int high=arr.size()-1;
        while(low<high)
        {
            if(arr.get(low)+arr.get(high)>k)
            {
                high--;
            }
            else
               if(arr.get(low)+arr.get(high)<k)   
            {
                low++;
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
}