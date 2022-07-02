class Solution {
   
     public static int val(int a[],int i,int n,int t,int dp[][][],int k)
    {
         if(k==0)
         {
             return 0;
         }
        if(i==n)
        {
            if(t==0 && k>0)
            {
                return 0;
            }
            else
            return -100000;
        }
         
        if(dp[i][k][t]!=-1)
        {
            return dp[i][k][t];
        }
        int op1=val(a,i+1,n,t,dp,k);
         int op2=0;
        if(t==1)
        {
         op2=a[i]+val(a,i+1,n,t^1,dp,k-1);
        }
        if(t==0)
        {
         op2=-1*a[i]+val(a,i,n,t^1,dp,k);
        }
         
        return dp[i][k][t]=Math.max(op1,op2);
    }
   
    public int maxProfit(int k, int[] prices) 
    {
        
         int n=prices.length;
        int dp[][][]=new int[n+10][k+10][3];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=k;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return val(prices,0,n,0,dp,k);
    }
}