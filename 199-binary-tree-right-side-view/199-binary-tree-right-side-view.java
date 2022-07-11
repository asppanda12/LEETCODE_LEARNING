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
    public List<Integer> rightSideView(TreeNode root) 
    {
         List<Integer> arr=new ArrayList<Integer>();
        if(root==null)
        {
            return arr;
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
       
        arr.add(root.val);
        while(qu.isEmpty()==false)
        {
                
            Queue<TreeNode> qu1=new LinkedList<>();
            while(qu.isEmpty()==false)
            {
                TreeNode src=qu.peek();qu.poll();
                if(src.left!=null)
                qu1.add(src.left);
                if(src.right!=null)
                qu1.add(src.right);
            }
             int val=-1000;
            while(qu1.isEmpty()==false)
            {
                qu.add(qu1.peek());
                val=qu1.peek().val;
                qu1.poll();
            }
            if(val!=-1000)
            arr.add(val);
        }
        return arr;
    }
}