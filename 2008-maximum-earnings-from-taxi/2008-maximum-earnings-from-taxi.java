class Solution 
{
    public static int upperbound(int[][] rides,int n,int target)
    {
        int low=0;int high=n;
        while(low<high)
        {
            int mid=(low+high)>>1;
            // System.out.println(mid+" "+low+" "+high);
            if(rides[mid][0]>=target)
            {
                high=mid;
            }
            else
            if(rides[mid][0]<target)
            {
                low=mid+1;
            }
            
        }
        return low;
    }
    public static long val(int[][] rides,int i,int n,long dp[])
    {
        if(i==n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        return dp[i]=Math.max((rides[i][1]-rides[i][0]+rides[i][2])+val(rides,upperbound(rides,rides.length,rides[i][1]),rides.length,dp),val(rides,i+1,rides.length,dp));
    }
    public long maxTaxiEarnings(int n, int[][] rides) 
    {
        Arrays.sort(rides,(a,b)->Integer.compare(a[0],b[0]));
        long dp[]=new long[n+190];
        Arrays.fill(dp,-1);
       System.out.println(Arrays.deepToString(rides));
        
        return val(rides,0,rides.length,dp);
        
    }
}