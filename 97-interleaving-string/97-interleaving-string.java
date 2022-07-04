class Solution
{
    public int isLetter(String s1,String s2,String s3,int i,int j,int k,int dp[][][])
    {
        
        if(i==s1.length() && j==s2.length() && k==s3.length())
        {
            return 1;
        }
        if(i==s1.length())
        {
            while(j<s2.length() && k<s3.length())
            {
                if(s2.charAt(j)!=s3.charAt(k))
                {
                    return 0;
                }
                j++;k++;
            }
            
            if(j==s2.length() && k==s3.length())
            {
                return 1;
            }
            return 0;
        }
        if(j==s2.length())
        {
            while(i<s1.length() && k<s3.length())
            {
                if(s1.charAt(i)!=s3.charAt(k))
                {
                    return 0;
                }
                i++;k++;
            }
            if(i==s1.length() && k==s3.length())
            {
                return 1;
            }
            return 0;
        }
        if(k==s3.length())
        {
            return 0;
        }
        if(dp[i][j][k]!=-1)
        {
            return dp[i][j][k];
        }
        int flag=0;
        if(i<s1.length() &&  k<s3.length()  && s1.charAt(i)==s3.charAt(k))
        {
            flag|=isLetter(s1,s2,s3,i+1,j,k+1,dp);
        }
        if(j<s2.length() &&  k<s3.length()  && s2.charAt(j)==s3.charAt(k))
        {
              flag|=isLetter(s1,s2,s3,i,j+1,k+1,dp);
        }
        else
        {
            flag|=isLetter(s1,s2,s3,i+1,j,k,dp)|isLetter(s1,s2,s3,i,j+1,k,dp);
        }
        return dp[i][j][k]=flag;
    }
    public boolean isInterleave(String s1, String s2, String s3) 
    {
        if(s1.length()+s2.length()>s3.length())
        {
            return false;
        }
        int dp[][][]=new int[s1.length()+1][s2.length()+1][s3.length()+1];
        for(int i=0;i<=s1.length();i++)
        {
            for(int j=0;j<=s2.length();j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return isLetter(s1,s2,s3,0,0,0,dp)==1;
    }
}