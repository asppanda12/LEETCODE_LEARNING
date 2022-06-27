class Solution 
{
    public static double val(double dp[][],int pos,int j,int k,int[] suff,int n)
    {
       
        if(pos>=j)
        {
            return 0.0;
        }
        if(k==0)
        {
            return Double.MIN_VALUE;
        }
        if(dp[pos][k]!=-1.0)
        {
            return dp[pos][k];
        }
        double max=Double.MIN_VALUE;
        for(int i=pos;i<j;i++)
        {
            double left=0;
            if(pos==0)
            {
                left=suff[i];
            }
            else
            {
                left=suff[i]-suff[pos-1];
            }
            
            double x=left/(double)(i-pos+1);
            double right=val(dp,i+1,j,k-1,suff,n);
            if(right!=Double.MIN_VALUE)
            {
                  max=Math.max(x+right,max);
            }

        }
        return dp[pos][k]=max;
    
    
    }
    public double largestSumOfAverages(int[] nums, int k)
    {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        double dp[][]=new double[n+10][k+10];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1.0);
        }
        return val(dp,0,n,k,prefix,n);
        
    }
}