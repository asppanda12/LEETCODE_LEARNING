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
class BSTIterator {
    Stack<TreeNode> st;
    public  void puttree_node(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        st.add(root);
        puttree_node(root.left);
    }
    public BSTIterator(TreeNode root)
    {
        st=new Stack<TreeNode>();
        puttree_node(root);
    }
    
    public int next() 
    {
        TreeNode root=st.peek();
        st.pop();
        if(root.right!=null)
        {
            puttree_node(root.right);
        }
       return root.val;   
    }
    
    public boolean hasNext() 
    {
        if(st.isEmpty()==false)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */