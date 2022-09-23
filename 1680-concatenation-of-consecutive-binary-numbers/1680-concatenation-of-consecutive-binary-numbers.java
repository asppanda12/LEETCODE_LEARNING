class Solution 
{
    static int mod=(int)(1e9+7);
    public int concatenatedBinary(int n) 
    {
        long count=0;
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            long x=Integer.toBinaryString(i).length();
            sum=sum<<x;
            sum=(sum+i)%mod;
        }
        return (int)(sum%mod);
    }
}