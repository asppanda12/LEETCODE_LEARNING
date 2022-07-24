class Solution 
{
    
    public static boolean Value(TreeNode root,TreeNode p,ArrayList<TreeNode> arr)
    {
        if(root==null)
        {
            return false;
        }
        if(root==p)
        {
            arr.add(root);
            return true;
        }
      boolean left=Value(root.left,p,arr);
      boolean right=Value(root.right,p,arr);
     if((left|right)==true)
     {
         arr.add(root);
         return true;
     }
    return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        ArrayList<TreeNode> left=new ArrayList<TreeNode>();
        ArrayList<TreeNode> right=new ArrayList<TreeNode>();
        Value(root,p,left);
         Value(root,q,right);
          Collections.reverse(left);
        Collections.reverse(right);
        System.out.println(left);
         System.out.println(right);
        for(int i=0;i<Math.min(left.size(),right.size());i++)
        {
            if(left.get(i).val!=right.get(i).val)
            {
                return left.get(i-1);
            }
        }
        if(left.size()>right.size())
        {
            return left.get(right.size()-1);
        }
        else
        {
            return right.get(left.size()-1);
        }
        

    }

}