class Solution 
{
     public int dfs(ArrayList<ArrayList<Integer>> adj,int src,int v[],int time[],int dp[])
    {
        if(adj.get(src).size()==0)
        {
           
            return time[src-1];
        }
        v[src]=1;
       int max=0;
        for(Integer a:adj.get(src))
        {
            if(v[a]==0)
            {
                  max=Math.max(max,dfs(adj,a,v,time,dp));
            }
            else
            { 
                max=Math.max(max,dp[a]);
            }
        }
               
           dp[src]=time[src-1]+max;
        return dp[src];
    }
    public int minimumTime(int n, int[][] relations, int[] time) 
    {
        int m=relations.length;
        ArrayList<ArrayList<Integer>> adj=new  ArrayList<ArrayList<Integer>>();

        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++)
        {
            int u=relations[i][0];
            int v=relations[i][1];
            adj.get(v).add(u);
        }
        
       int v[]=new int[n+1];
        int max=0;
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            if(v[i]==0)
            {
                max=Math.max(max,dfs(adj,i,v,time,dp));
            }
        }
        return max;
        
    }
}