class Solution
{
    public static int ans(String s,String p,int i,int j,int[][] dp)
    {
        if(i>=s.length() && (j>=p.length()||(j+1==p.length() && p.charAt(j)=='*')))
        {
            return 1;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int flag=0;
        if((j+1)<p.length() && p.charAt(j+1)=='*')
        {
            if((i<s.length())&&(((s.charAt(i))==(p.charAt(j)))||p.charAt(j)=='.'))
            {
               flag=ans(s,p,i+1,j,dp);   
            }           
            flag|=ans(s,p,i,j+2,dp);
        }
        else
        if((i<s.length() && j<p.length())&&(((s.charAt(i))==(p.charAt(j)))||p.charAt(j)=='.'))
        {
            flag=ans(s,p,i+1,j+1,dp);
        }
        return dp[i][j]=flag;
            
    }
    public boolean isMatch(String s, String p) 
    {
        int dp[][]=new int[s.length()+2][p.length()+2];
        for(int i=0;i<=s.length();i++)
        {
            for(int j=0;j<=p.length();j++)
            {
                dp[i][j]=-1;
            }
        }
        return ans(s,p,0,0,dp)==1?true:false;
    }
}