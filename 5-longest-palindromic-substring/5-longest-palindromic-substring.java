class Solution {
    public String longestPalindrome(String s) 
    {
        
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        int max=0;int l=0;int h=0;
        for(int g=0;g<n;g++)
        {
            for(int k=0;k<n;k++)
            {
                int i=k;int j=k+g;
                if(j<n)
                {
                
                if(g==0)
                {
                    dp[i][i]=true;
                    l=i;h=j;
                    max=1;
                }
                else
                if(g==1)
                {
                   dp[i][j]=s.charAt(i)==s.charAt(j);
                    if(dp[i][j])
                    {
                        if(max<2)
                        {
                            l=i;h=j;
                            max=2;
                        }
                    }
                }
                else
                {
                   if(s.charAt(i)==s.charAt(j))
                   {
                       dp[i][j]=dp[i+1][j-1];
                       if(dp[i][j])
                       {
                           if(max<g+1)
                           {
                               l=i;h=j;
                               max=g+1;
                           }
                       }
                   }
                    else
                    {
                        dp[i][j]=false;
                    }
                }
                }
            }
            }
        String s1=s.substring(l,h+1);
        return s1;
        
    }
}