class Solution
{
    public static int val(int[] nums,int i,int target,int n,int dp[][])
    {
        if(target==0)
        {
            return 1;
        }
        if(i==n)
        {
            return 0;
        }
        if(dp[i][target]!=-1)
        {
            return dp[i][target];
        }
        int total=0;
        for(int j=0;j<n;j++)
        {
            if(target>=nums[j])
            {
                total+=val(nums,i,target-nums[j],n,dp);
            }
        }
        
        return dp[i][target]=total;
    }
    public int combinationSum4(int[] nums, int target)
    {
        int n=nums.length;
        int[][] dp=new int[n+10][target+10];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return val(nums,0,target,n,dp);
    }
        
}