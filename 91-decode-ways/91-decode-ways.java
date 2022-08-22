class Solution 
{
    public static int val(String s,int pos,int j,int dp[])
    {
        if(pos==j+1)
        {
            return 1;
        }
        int total=0;
        if(dp[pos]!=-1)
        {
            return dp[pos];
        }
        for(int i=pos;i<=j;i++)
        {
            String str=s.substring(pos,i+1);
 
            if(str.length()<=2 && str.charAt(0)!='0')
            {
                int t=Integer.parseInt(str);
                if(t<=26 && t>=1)
                {
                    total+=val(s,i+1,j,dp);
                }
            }
        }
        return dp[pos]=total;
    }
    public int numDecodings(String s) 
    {
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp,-1);
        return val(s,0,s.length()-1,dp);
    }
}