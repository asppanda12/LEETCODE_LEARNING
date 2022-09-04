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
        TreeNode x;
        int y;
        Pair(TreeNode x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
        TreeMap<Integer,ArrayList<Integer>> map1=new TreeMap<>();
        Queue<Pair> qu=new LinkedList<Pair>();
        qu.add(new Pair(root,0));
        while(qu.isEmpty()==false)
        {
           TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<Integer,ArrayList<Integer>>(); 
           int size=qu.size();
           for(int i=0;i<size;i++)
           {
                 TreeNode root1=qu.peek().x;
                 int val1=qu.peek().y;
                 qu.poll();
                  if(map.containsKey(val1)==false)
                  {
                      map.put(val1,new ArrayList<Integer>());
                  }
               map.get(val1).add(root1.val);
                if(root1.left!=null)
                 {
                     qu.add(new Pair(root1.left,val1-1));
                 }
                 if(root1.right!=null)
                 {
                     qu.add(new Pair(root1.right,val1+1));
                 }
           }
            for(Map.Entry<Integer,ArrayList<Integer>> m:map.entrySet())
            {
                int key=m.getKey();
                ArrayList<Integer> ap=m.getValue();
                if(map1.containsKey(key)==false)
                  {
                      map1.put(key,new ArrayList<Integer>());
                  }
               ArrayList<Integer> arr=new ArrayList<>(ap);
                Collections.sort(arr);
                map1.get(key).addAll(arr);

            }
        }
        List<List<Integer>> ls=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> ma:map1.entrySet())
        {
             ls.add(ma.getValue());
        }
        return ls;
    }
}