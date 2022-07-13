class Solution 
{
    public static int val(int[] nums,int rem,int i,int n,int dp[][])
    {
        if(i==n)
        {
            if(rem==0)
            {
                return 0;
            }
            return Integer.MIN_VALUE;
        }
        if(dp[i][rem]!=-1)
        {
            return dp[i][rem];
        }
        int ans=val(nums,(nums[i]+rem)%3,i+1,n,dp);
        if(ans!=Integer.MIN_VALUE)
        {
            ans+=nums[i];
        }
        return dp[i][rem]=Math.max(ans,val(nums,rem,i+1,n,dp));
    }
    public int maxSumDivThree(int[] nums) 
    {
        int n=nums.length;
        int dp[][]=new int[n+10][3];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return val(nums,0,0,n,dp);
        
    }
}