class Solution 
{
    public int dfs(int arr[],HashMap<Integer,Integer> map,int i,int j,int n,int dp[][])
    {
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int val=arr[i]+arr[j];
        if(map.containsKey(val)==false)
        {
            return dp[i][j]=2;
        }
        else
        {
            return dp[i][j]=1+dfs(arr,map,j,map.get(val),n,dp);
        }
    }
    public int lenLongestFibSubseq(int[] arr) 
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],i);
        }
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j]=-1;
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                max=Math.max(dfs(arr,map,i,j,n,dp),max);
            }
        }
        return max==2?0:max;
    }
}