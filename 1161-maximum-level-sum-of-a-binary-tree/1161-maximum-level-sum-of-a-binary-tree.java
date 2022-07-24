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
    public static int bfs(TreeNode root)
    {
         Queue<TreeNode> qu=new LinkedList<>();
         qu.add(root);
         int max=Integer.MIN_VALUE;int level=0;int t=0;
         while(qu.isEmpty()==false)
         {
             int size=qu.size();
             int sum=0;t++;
             for(int i=0;i<size;i++)
             {
                 TreeNode ro=qu.poll();
                 sum+=ro.val;
                 if(ro.left!=null)
                 {
                     qu.add(ro.left);
                 }
                  if(ro.right!=null)
                 {
                     qu.add(ro.right);
                 }
             }
             if(sum>max)
             {
                 max=sum;
                 level=t;
             }
         }
        return level;
     
    }
    public int maxLevelSum(TreeNode root) {
        return bfs(root);
    }
}