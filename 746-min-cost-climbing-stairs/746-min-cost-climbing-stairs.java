class Solution 
{
    public static int val(int i,int dp[],int n,int cost[])
    {
        if(i>=n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        return dp[i]=cost[i]+Math.min(val(i+1,dp,n,cost),val(i+2,dp,n,cost));
    }
    public int minCostClimbingStairs(int[] cost)
    {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int min=Integer.MAX_VALUE;
        
        min=Math.min(val(0,dp,n,cost),val(1,dp,n,cost));   
        
        return min;
    }
}