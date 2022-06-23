class Solution
{
    public TreeSet<Integer> dfs(ArrayList<ArrayList<Integer>> adj,int src,int v[],ArrayList<TreeSet<Integer>> adj1)
    {
        if(adj.get(src).size()==0)
        {
           TreeSet<Integer> arp=new TreeSet<Integer>();
            adj1.get(src).add(src);
            arp.add(src);
            return arp;
        }
        v[src]=1;
        TreeSet<Integer> tq=new TreeSet<Integer>();
        for(Integer a:adj.get(src))
        {
            if(v[a]==0)
            {
                TreeSet<Integer> arr=dfs(adj,a,v,adj1);
                tq.addAll(arr);
            }
            else
            { 
                
                tq.addAll(adj1.get(a));
            }
        }
        tq.add(src);
        adj1.get(src).addAll(tq);
       
      
        return tq;
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges)
    {
        
        int m=edges.length;
        ArrayList<ArrayList<Integer>> adj=new  ArrayList<ArrayList<Integer>>();
        ArrayList<TreeSet<Integer>> adj1=new  ArrayList<TreeSet<Integer>>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
            adj1.add(new TreeSet<Integer>());
        }
        int indegree[]=new int[n];
        for(int i=0;i<m;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(v).add(u);
            adj1.get(v).add(u);
        }
        
       int v[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(v[i]==0)
            {
                dfs(adj,i,v,adj1);
            }
        }
         List<List<Integer>> res=new  ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        {
            List<Integer> arr=new ArrayList<>(adj1.get(i));
            arr.remove(new Integer(i));
            res.add(arr);
        }
        return res;
        }
        
        
    }