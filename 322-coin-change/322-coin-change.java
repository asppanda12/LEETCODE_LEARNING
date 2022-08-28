class Solution 
{
    public static int noWays(int[]coins,int amount,int n,int dp[][])
    {
           if(amount<0)
           {
               return Integer.MAX_VALUE;
           }
        else
          if(amount==0)
          {
              return 0;
          }
        else
          if(n==0)
          {
              return Integer.MAX_VALUE;
          }
        else
           if(dp[n][amount]>-1)
           {
               return dp[n][amount];
           }
        else
          {
             int val=Integer.MAX_VALUE;
            if(amount>=coins[n-1])
              {
                 val=noWays(coins,amount-coins[n-1],n,dp);
                   if(val!=Integer.MAX_VALUE)
                   {
                       val=val+1;
                   }
              }
              int min=Math.min(val,noWays(coins,amount,n-1,dp));
              return dp[n][amount]=min;
          }
    }
    public int coinChange(int[] coins, int amount)
    {
        int dp[][]=new int[coins.length+10][amount+10];
        for(int i=0;i<=coins.length;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                dp[i][j]=-1;
            }
        }
        if(noWays(coins,amount,coins.length,dp)==Integer.MAX_VALUE)
        {
            return -1;
        }
        return noWays(coins,amount,coins.length,dp);
    }
}
