class Solution
{
    public static int val(ArrayList<Integer> arr,int sum,int dp[][],int n)
    {
        if(sum==0)
        {
            return 0;
        }
        if(n<=0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[n][sum]!=-1)
        {
            return dp[n][sum];
        }
        if(sum<arr.get(n-1))
        {
            return dp[n][sum]=val(arr,sum,dp,n-1);
        }
        else
        {
            if(val(arr,sum-arr.get(n-1),dp,n)==Integer.MAX_VALUE)
            {
                return dp[n][sum]=val(arr,sum,dp,n-1);
            }
            else
            return dp[n][sum]=Math.min(1+val(arr,sum-arr.get(n-1),dp,n),val(arr,sum,dp,n-1));
        }
    }
    public int minimumNumbers(int num, int k) 
    {
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=1;i<=num;i++)
        {
            if(i%10==k)
            {
                arr.add(i);
            }
        }
        if(num==0)
        {
            return 0;
        }
        if(arr.size()==0)
        {
            return -1;
        }
        
        System.out.println(arr);
        int dp[][]=new int[arr.size()+2][num+10];
        for(int i=0;i<=arr.size();i++)
        {
        Arrays.fill(dp[i],-1);
        }
        int kp=val(arr,num,dp,arr.size());
        return val(arr,num,dp,arr.size())==Integer.MAX_VALUE?-1:kp;
        
    }
}