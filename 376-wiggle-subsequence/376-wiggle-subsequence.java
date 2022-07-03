class Solution 
{
    public static int val(int nums[],int i,int k,int n,int dp[][])
    {
        if(n<=i)
        {
            return 0;
        }
        else
        if(i==n-1)
        {
            return 1;
        }
        int max=0;
        if(dp[i][k]!=-1)
        {
            return dp[i][k];
        }
        if(k==0)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]>nums[i])
                {
                    max=Math.max(val(nums,j,k^1,n,dp),max);
                }
            }
        }
        else
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]<nums[i])
                {
                    max=Math.max(val(nums,j,k^1,n,dp),max);
                }
            }
        }
        return dp[i][k]=1+max;
        
    }
    public int wiggleMaxLength(int[] nums) {
        
        int n=nums.length;
        
        int dp[][]=new int[n+1][2];
         int dp1[][]=new int[n+1][2];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
            Arrays.fill(dp1[i],-1);
        }
        return Math.max(val(nums,0,0,nums.length,dp),val(nums,0,1,nums.length,dp1));
    }
}