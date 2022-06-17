class Solution {
    public long minimumPerimeter(long neededApples)
    {
        long prev_sum[]=new long[600000];
        long dp[]=new long[600000];
        prev_sum[1]=2+1+2;
        dp[1]=12;
        for(int i=2;i<600000;i++)
        {
            prev_sum[i]=prev_sum[i-1]+(i+i)*2+(2*i+1-2);
            dp[i]=(prev_sum[i-1]+(2*i+1-2)+(i+i))*4;
        }
       long sum=0;
        for(int i=1;i<600000;i++)
        {
            if(sum+dp[i]>neededApples)
            {
                return 2*i*4;
            }
            else
            if(sum+dp[i]==neededApples)
            {
                return 2*i*4;
            }
            else
            {
                  sum=sum+dp[i];
            }
        }
        return 1;
    }
}