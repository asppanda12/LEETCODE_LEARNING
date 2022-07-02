class Solution
{
    public static long val(int[] arr,int k,int i,int t,int n,long dp[][][])
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
            {
                return Integer.MIN_VALUE;
            }
        }
        if(dp[i][k][t]!=-1)
        {
            return dp[i][k][t];
        }
        long output1=val(arr,k,i+1,t,n,dp);
        long output2=0;
        if(t==0)
        {
            output2=val(arr,k,i+1,t^1,n,dp)-arr[i];
        }
        else
        {
            output2=arr[i]+val(arr,k-1,i+1,t^1,n,dp);
        }
        return dp[i][k][t]=Math.max(output1,output2);
    }
    public int maxProfit(int[] prices) 
    {
        long dp[][][]=new long[prices.length+1][3][2];

        for(int i=0;i<=prices.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                 for(int k=0;k<2;k++)
            {
                dp[i][j][k]=-1;
            }
            }
        }
        return (int)(val(prices,2,0,0,prices.length,dp));
        
    }
}