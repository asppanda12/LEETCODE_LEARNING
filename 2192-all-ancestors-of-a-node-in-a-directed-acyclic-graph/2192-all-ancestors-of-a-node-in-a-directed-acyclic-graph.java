class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges)
    {
      ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
         for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<Integer>());
        }
        int indegree[]=new int[n];
    for(int i=0;i<edges.length;i++)
    {
        int u=edges[i][0];
        int v=edges[i][1];
            arr.get(u).add(v);
             
           indegree[edges[i][1]]++;
    }
  ArrayList<TreeSet<Integer>> ans=new ArrayList<TreeSet<Integer>>(); 
        for(int i=0;i<n;i++)
        {
            ans.add(new TreeSet<Integer>());
        }
        Queue<Integer> qu=new LinkedList<Integer>();
                int v[]=new int[n];

        for(int j=0;j<n;j++){
            if(indegree[j]==0)
            {
                qu.add(j);
                v[j]=1;
            }
        }
        while(qu.isEmpty()==false)
        {
            int t=qu.poll();
            for(Integer adj:arr.get(t))
            {
                if(v[adj]==0)
                {
                     indegree[adj]--;
                     ans.get(adj).addAll(ans.get(t));
                     ans.get(adj).add(t);
                    if(indegree[adj]==0)
                    {
                        qu.add(adj);
                        v[adj]=1;
                    }
                }
            }
        }
          List<List<Integer>> ans1=new ArrayList<List<Integer>>(); 
      for(int i=0;i<n;i++)
      {
          ans1.add(new ArrayList<Integer>(ans.get(i)));
      }
        return ans1;
        
    }
    
}