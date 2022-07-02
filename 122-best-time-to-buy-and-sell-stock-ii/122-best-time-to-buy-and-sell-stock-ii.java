class Solution
{
    public static int val(int[] prices,int i,int n,int k,int dp[][])
    {
        if(i==n)
        {
            return 0;
        }
        if(dp[i][k]!=-1)
        {
            return dp[i][k];
        }
        if(k==0)
        {
            return dp[i][k]=Math.max(-1*prices[i]+val(prices,i+1,n,1,dp),val(prices,i+1,n,0,dp));
        }
        else
        {
             return dp[i][k]=Math.max(prices[i]+val(prices,i+1,n,0,dp),val(prices,i+1,n,1,dp));
        }
    }
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int dp[][]=new int[n+10][3];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return val(prices,0,prices.length,0,dp);
        
    }
}