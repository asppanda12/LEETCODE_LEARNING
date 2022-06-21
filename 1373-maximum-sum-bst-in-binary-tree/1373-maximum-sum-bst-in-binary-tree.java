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
    class Pair
    {
        boolean validate;
        int sum;
        int min;
        int max;
        int max_sum;
        Pair(boolean validate,int sum,int min,int max,int max_sum)
        {
            this.validate=validate;
            this.sum=sum;
            this.min=min;
            this.max=max;
            this.max_sum=max_sum;
        }
    }
    public Pair val(TreeNode root)
    {
      
        if(root.left==null &&  root.right==null)
        {
            Pair a=new Pair(true,root.val,root.val,root.val,root.val);
            return a;
        }
        
       Pair right=null;Pair left=null;int sum1=root.val;int min=root.val;int max=root.val;int max_sum=root.val;boolean validate=false;boolean left1=false;boolean right1=false;
        
        
       if(root.left!=null)
       {
           left=val(root.left);
           if(root.val>left.min && root.val>left.max && root.val>root.left.val)
           {
              min=left.min;
              sum1+=left.sum;
               left1=left.validate;
           }          
       }
        else
        {
            left1=true;
        }
        if(root.right!=null)
       {
           right=val(root.right);
           if(root.val<right.min && root.val<right.max && root.val<root.right.val)
           {
              right1=right.validate;
               max=right.max;
               sum1+=right.sum;
           }
       }
       else
       {
          right1=true;
       }
                
        
        validate=left1&right1;
        if(validate==false){
            sum1=root.val;min=root.val;max=root.val;
        }
        if(validate==true)
        {
             if(left!=null && right!=null)
        max_sum=Math.max(sum1,Math.max(left.max_sum,right.max_sum));
            else
            if(left==null)
        max_sum=Math.max(sum1,right.max_sum);
            else
            if(right==null)
        max_sum=Math.max(sum1,left.max_sum);
        }
        else
        {
            if(left!=null && right!=null)
        max_sum=Math.max(left.max_sum,right.max_sum);
            else
            if(left==null)
        max_sum=right.max_sum;
            else
            if(right==null)
        max_sum=left.max_sum;
        }
        // System.out.println(root.val+" "+sum1+" "+min+" "+max+" "+max_sum);
      Pair ap=new Pair(validate,sum1,min,max,max_sum);
        return ap;
      
    }
    public int maxSumBST(TreeNode root)
    {
        
        return Math.max(val(root).max_sum,0);
    }
}