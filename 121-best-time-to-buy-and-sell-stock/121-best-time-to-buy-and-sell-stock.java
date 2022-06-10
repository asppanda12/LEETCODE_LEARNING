class Solution
{
    public static int val(int[] prices,int i,int k,int n,int t,int dp[][][])
    {
        if(k==0)
        {
            return 0;
        }
        if(i==n)
        {
            return -100000;
        }
        if(dp[i][k][t]!=-1)
        {
            return dp[i][k][t];
        }
        if(t==0)
        {
            return  dp[i][k][t]=Math.max(-1*prices[i]+val(prices,i+1,k,n,t^1,dp),val(prices,i+1,k,n,t,dp));
        }
        else
        if(t==1)
        {
            return  dp[i][k][t]=Math.max(prices[i]+val(prices,i+1,k-1,n,t^1,dp),val(prices,i+1,k,n,t,dp));
        }
        return -1;
    }
    public int maxProfit(int[] prices)
    {
        int n=prices.length;
        int dp[][][]=new int[n+1][2][2];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=1;j++)
            {
              Arrays.fill(dp[i][j],-1);
            }
        }
        return  Math.max(0,val(prices,0,1,prices.length,0,dp));
    }
}