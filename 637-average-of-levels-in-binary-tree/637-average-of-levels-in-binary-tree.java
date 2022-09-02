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
    public List<Double> averageOfLevels(TreeNode root)
    {
        Queue<TreeNode> qu=new LinkedList<TreeNode>();
        qu.add(root);
        List<Double> ls=new ArrayList<>();
        while(qu.isEmpty()==false)
        {
            int size=qu.size();
        
            long sum=0;int cnt=qu.size();
            for(int i=0;i<size;i++)
            {
                 TreeNode root1=qu.peek();
                qu.poll();
                sum+=root1.val;
                 if(root1.left!=null)
                 {
                     qu.add(root1.left);
                 }
                
                 if(root1.right!=null)
                 {
                     qu.add(root1.right);
                 }
            }
            double u=sum/(double)(cnt);
            ls.add(u);
        }
        
        return ls;
    }
}