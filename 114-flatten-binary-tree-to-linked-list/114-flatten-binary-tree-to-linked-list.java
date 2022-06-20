class Solution {
    TreeNode result;
    public void flatten(TreeNode root) {
       result = new TreeNode(0);
        helper(root);
    }
    
    private void helper(TreeNode node) {
        if (node == null)
            return;
        
        TreeNode left = node.left;
        TreeNode right = node.right;
        result.left = null;
        result.right = node;
        result = result.right;
        helper(left);
        helper(right);
         
    }
}