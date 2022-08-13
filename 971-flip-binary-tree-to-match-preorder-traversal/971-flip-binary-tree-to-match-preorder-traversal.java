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
    static class Pair
    {
        TreeNode parent;
        int dir;
        TreeNode root;
        Pair(TreeNode parent,int dir,TreeNode root)
        {
            this.parent=parent;
            this.dir=dir;
            this.root=root;
            
        }
    }
    static int i;  static boolean flag1; static boolean flag2=false;
    public static void preorder(TreeNode root,TreeNode pre[],int t,TreeNode parent,HashMap<Integer,Pair> map)
    {
        if(root==null)
        {
            return;
        }
        // System.out.println(i+" "+root.val);
        pre[i++]=root;
        map.put(root.val,new Pair(parent,t,root));
        preorder(root.left,pre,0,root,map);
        preorder(root.right,pre,1,root,map);        
    }
    public static void compare(TreeNode root,List<Integer> ls,int n,int voyage[])
    {
        TreeNode pre[]=new TreeNode[n];
        HashMap<Integer,Pair> map=new HashMap<>();
                 i=0;

        preorder(root,pre,-1,null,map);
        // System.out.println(Arrays.toString(pre));
        // for(Map.Entry<Integer,Pair> m:map.entrySet())
        // {
        //     if(m.getValue().parent!=null)
        //     System.out.println(m.getKey()+" "+m.getValue().parent.val+" "+  m.getValue().dir);
        // }
            // System.out.println(map);
        boolean flag=false;
        int i=0;
        for(i=0;i<voyage.length;i++)
        {
            if(voyage[i]!=pre[i].val)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            return;
        }
        if(map.containsKey(voyage[i])==true && map.get(pre[i].val).parent==map.get(voyage[i]).parent)
        {
            
            if(map.get(pre[i].val).dir==0)
            {
                 TreeNode pare=map.get(pre[i].val).parent;
                 pare.left=map.get(voyage[i]).root;
                 pare.right=pre[i];
                ls.add(pare.val);
                 compare(root,ls,n,voyage);
            }
            else
            {
                 TreeNode pare=map.get(pre[i].val).parent;
                 pare.right=map.get(voyage[i]).root;
                 pare.left=pre[i];
                ls.add(pare.val);
                 compare(root,ls,n,voyage);
            }
            
        }
        else
        {
            flag2=true;
        }
        return;
    }
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage)
    {
        List<Integer> ls=new ArrayList<Integer>();
        TreeNode pre[]=new TreeNode[voyage.length];
        HashMap<Integer,Pair> map=new HashMap<>();

        compare(root,ls,voyage.length,voyage);
                        i=0;

        preorder(root,pre,-1,null,map);
        if(flag2==false)
        {
            return ls;
        }
        boolean flag11=false;
        for(int i=0;i<voyage.length;i++)
        {
            if(voyage[i]!=pre[i].val)
            {
                flag11=true;
            }
        }
        
        if(flag11==true)
        {List<Integer> ls1=new ArrayList<Integer>();
            ls1.add(-1);
            return ls1;
        }
        return ls;
    }
}