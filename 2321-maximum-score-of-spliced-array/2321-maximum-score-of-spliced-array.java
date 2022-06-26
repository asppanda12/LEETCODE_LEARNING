class Solution
{
    public int val(int[] nums1,int[] nums2,int dp[][][],int i,int a,int b,int n)
    {
        if(i==n)
        {
            return 0;
        }
        int sum=0;
        if(dp[i][a][b]!=-1)
        {
            return dp[i][a][b];
        }
        if(a==0)
        {
            if(b==0)
            {
                sum=Math.max(sum,nums1[i]+Math.max(val(nums1,nums2,dp,i+1,0,0,n),val(nums1,nums2,dp,i+1,1,1,n)));
            }
            else
            {
                sum=Math.max(sum,nums2[i]+Math.max(val(nums1,nums2,dp,i+1,0,1,n),val(nums1,nums2,dp,i+1,1,0,n)));
            }                
        }
        else
        if(a==1)
        {
             if(b==0)
            {
                sum=Math.max(sum,nums1[i]+Math.max(val(nums1,nums2,dp,i+1,2,1,n),val(nums1,nums2,dp,i+1,1,0,n)));
            }
            else
            {
                sum=Math.max(sum,nums2[i]+Math.max(val(nums1,nums2,dp,i+1,2,0,n),val(nums1,nums2,dp,i+1,1,1,n)));
            }       
        }
        else
        if(a==2)
        {
            if(b==0)
            {
                sum=Math.max(sum,nums1[i]+val(nums1,nums2,dp,i+1,2,0,n));
            }
            else
            {
                sum=Math.max(sum,nums2[i]+val(nums1,nums2,dp,i+1,2,1,n));
            }
        }
        return dp[i][a][b]=sum;
    }
    public int maximumsSplicedArray(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int dp[][][]=new int[n+1][3][2];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<3;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
         return Math.max(val(nums1,nums2,dp,0,0,0,n),val(nums1,nums2,dp,0,0,1,n));
    }
}