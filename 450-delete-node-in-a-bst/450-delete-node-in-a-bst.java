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
    static TreeNode key;
    static TreeNode left_most;
    static TreeNode papa;
    public static boolean find_key(TreeNode root,int key1,TreeNode parent)
    {
        
        if(root==null)
        {
            return false;
        }
        if(root.val==key1)
        {
            key=root;
            papa=parent;
            return true;
        }
       return  find_key(root.left,key1,root) | find_key(root.right,key1,root);
    }
     public static void left_most_find(TreeNode root,TreeNode papa)
    {
        
        if(left_most==null && root==null)
        {
            left_most=papa;
            return;
        }
         if(root==null)
         {
             return;
         }
        left_most_find(root.left,root);
        left_most_find(root.right,root);
    }
    public TreeNode deleteNode(TreeNode root, int key1) 
    {
        //given root dont have right
        // given root have right
        key=null;
        left_most=null;
        papa=null;
         
        if(find_key(root,key1,null))
        {
    
            if(papa==null)// if key is null
            {
                if(key.right!=null)//if(key  has any right null)
                {
               left_most_find(key.right,null);
               left_most.left=key.left;
                
                    return key.right;
                }
                else
                if(key.left!=null)//if(key  has any left null)
                {
                    return key.left;
                }
                else
                if(key.right==null && key.left==null)//if(key doesnt has any left & right null)
                {
                    
                    return null;
                        
                }
            }
            else
            if(key.right!=null)// if key is not root
            {
                 if(papa.right!=null && papa.right.val==key1)//if key is the right element of parent
                 {
                     papa.right=key.right;
                     left_most_find(key.right,null);
                     left_most.left=key.left;
                     // key.right=null;
                     // key.left=null;
                 }
                else
                if(papa.left!=null && papa.left.val==key1)//if key is the left element of parent
                 {
                     papa.left=key.right;
                     left_most_find(key.right,null);
                     left_most.left=key.left;
                     // key.right=null;
                     // key.left=null;
                    
                  }
                return root;
            }
            else
            if(key.left!=null)// if key is not root
            {
                
                 if(papa.right!=null && papa.right.val==key1)
                 {
                     papa.right=key.left;
                     // key.left=null;
                 }
                else
                if(papa.left!=null && papa.left.val==key1)
                 {
                     papa.left=key.left;
                      // key.left=null;
                  }
                return root;
            }
            else
            if(key.left==null && key.right==null)// if key is left
            {
                if(papa.right!=null && papa.right.val==key1)
                 {
                     papa.right=null;
                 }
                else
                if(papa.left!=null && papa.left.val==key1)
                 {
                     papa.left=null;
                  }
                return root;
            }
               
        }
        
            return root;
        
        
    }
}