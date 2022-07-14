class Solution 
{
    public static TreeNode ro(HashMap<Integer,Integer> map,int i,int j,int in,int or,int[] preorder,int[] inorder)
    {
        if(i>j)
        {
            return null;
        }
        int fin=preorder[i];
        int ind=map.get(preorder[i]);
        int l=i+1+ind-in-1;
        int h=l+1;
        TreeNode left=ro(map,i+1,l,in,ind-1,preorder,inorder);
        TreeNode right=ro(map,h,j,ind+1,or,preorder,inorder);
        TreeNode root=new TreeNode(fin,left,right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=inorder.length;
        for(int i=0;i<n;i++)
        {
            map.put(inorder[i],i);
        }
        return ro(map,0,n-1,0,n-1,preorder,inorder);
        
    }

}