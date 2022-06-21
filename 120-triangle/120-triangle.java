class Solution 
{
    public int val(List<List<Integer>> triangle,int i,int j,int n,int dp[][])
    {
        if(i==n)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int  a=triangle.get(i).get(j)+val(triangle,i+1,j,n,dp);
        int b=triangle.get(i).get(j)+val(triangle,i+1,j+1,n,dp);
        return dp[i][j]=Math.min(a,b);
    }
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int n=triangle.size();
        int dp[][]=new int[n+1][triangle.get(n-1).size()+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
         return val(triangle,0,0,triangle.size(),dp);
    }
}