class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        // Starting with level 0
        int level = 0;
        
        // Queue that save node and level of the node
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        
        // Starting with the root node
        q.offer(new Pair(root,level));
        
        List<Integer> temp = new ArrayList<>();
        while(!q.isEmpty()){
            
            // Traversing all the nodes at same level, and put their child in queue with increased level for further traversing
            while(q.peek() != null && q.peek().getValue() == level){
                TreeNode t = q.poll().getKey();
                temp.add(t.val);
                
				// Add left and right child
                if(t.left != null) q.offer(new Pair(t.left, level+1));
                if(t.right != null) q.offer(new Pair(t.right, level+1));
            }
            
            // Adding list to result
            res.add(temp);
            temp = new ArrayList<>();
            
            // Move to next level
            level++;
        }
        
        return res;
    }
    
}