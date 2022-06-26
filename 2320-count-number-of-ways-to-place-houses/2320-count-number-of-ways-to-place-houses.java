class Solution 
{
    static int mod=(int)(1e9+7);
    public static long val(int n,long dp[])
    {
        
        if(n<=0)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=(val(n-1,dp)%mod+val(n-2,dp)%mod)%mod;
    }
    public int countHousePlacements(int n) 
    {
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        long ans=val(n,dp);
        return (int)((ans%mod*ans%mod)%mod);
    }
}