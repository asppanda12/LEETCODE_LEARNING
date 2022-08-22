class Solution 
{
    public static int val(String s,int pos,int n,int dp[])
    {
        if(pos==n)
        {
            return 1;
        }
        if(dp[pos]!=-1)
        {
            return dp[pos];
        }
        int ans=0;
        int op1=(int)(s.charAt(pos)-'0');
        int op2=0;
        if(pos+1<n)
        {
            op2=Integer.parseInt(s.substring(pos,pos+2));
        }
        if(op1>0)ans+=val(s,pos+1,n,dp);
        if(op1>0 && op2>0 && op2<=26)ans+=val(s,pos+2,n,dp);
        return dp[pos]=ans;
    }
    public int numDecodings(String s) 
    {
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp,-1);
        return val(s,0,s.length(),dp);
    }
}