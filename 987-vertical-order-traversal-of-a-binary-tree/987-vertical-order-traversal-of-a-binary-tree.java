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
        int ind;
        TreeNode root1;
        Pair(TreeNode root1,int ind)
        {
            this.ind=ind;
            this.root1=root1;
        }
    }
    public void traverse(TreeMap<Integer,Integer> map,TreeNode root,TreeMap<Integer,ArrayList<Integer>> map2)
    {
       Queue<Pair> qu=new LinkedList<Pair>();
       qu.add(new Pair(root,0));
        map2.put(0,new ArrayList<Integer>());
                            map2.get(0).add(root.val);
 map.put(0,root.val);
        while(qu.isEmpty()==false)
        {
             int size=qu.size();
            TreeMap<Integer,ArrayList<Integer>> map1=new TreeMap<>();
            for(int i=0;i<size;i++)
            {
                Pair t=qu.peek();
                qu.poll();
                if(t.root1.left!=null)
                {
                    if(map.containsKey(t.ind-1)==false)
                    map.put(t.ind-1,t.root1.left.val);
                    if(map1.containsKey(t.ind-1)==false)
                    {
                        map1.put(t.ind-1,new ArrayList<Integer>());
                    }
                    map1.get(t.ind-1).add(t.root1.left.val);
                    qu.add(new Pair(t.root1.left,t.ind-1));
                }
                if(t.root1.right!=null)
                {
                    if(map.containsKey(t.ind+1)==false)
                    map.put(t.ind+1,t.root1.right.val);
                     if(map1.containsKey(t.ind+1)==false)
                    {
                        map1.put(t.ind+1,new ArrayList<Integer>());
                    }
                    map1.get(t.ind+1).add(t.root1.right.val);
                    qu.add(new Pair(t.root1.right,t.ind+1));
                }
            }
            for(Map.Entry<Integer,ArrayList<Integer>> ma:map1.entrySet())
        {
               if(map2.containsKey(ma.getKey())==false)
               {
                   map2.put(ma.getKey(),new ArrayList<Integer>());
               }
                ArrayList<Integer> ap1=new ArrayList<Integer>(ma.getValue());
                Collections.sort(ap1);
                map2.get(ma.getKey()).addAll(ap1);
        }
            
        }
        
    }
    public List<List<Integer>> verticalTraversal(TreeNode root)
    {
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();     
        TreeMap<Integer,ArrayList<Integer>> map1=new TreeMap<Integer,ArrayList<Integer>>();   
        traverse(map,root,map1);
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        System.out.println(map);
        for(Map.Entry<Integer,ArrayList<Integer>> ma:map1.entrySet())
        {
               arr.add((List)(ma.getValue()));
        }
        return arr;
    }
}