class Solution
{
    public int res(int dp[],int[][] pairs,int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int max=0;
        for(int j=n-1;j>0;j--)
        {
            if(pairs[j-1][1]<pairs[n-1][0])
            {
                max=Math.max(max,res(dp,pairs,j));
            }
        }
        return dp[n]=1+max;
    }
    public int findLongestChain(int[][] pairs) 
    {
     Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        int n=pairs.length;
        int m=pairs[0].length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int max=0;
        for(int i=n;i>0;i--)
        {
           max=Math.max(max,res(dp,pairs,n));
        }
        return max;
    }
}