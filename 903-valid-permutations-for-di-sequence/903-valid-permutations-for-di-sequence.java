class Solution
{
    static int v[];
    static int mod=(int)(1e9+7);
    public int val(String s,int i,int j,int n,int dp[][])
    {
        if(i==n)
        {
            return 1;
        }
        int max=0;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s.charAt(i)=='D')
        {
            for(int k=j-1;k>=0;k--)
            {
                if(v[k]==0)
                {
                    v[k]=1;
                    max=(max%mod+val(s,i+1,k,n,dp)%mod)%mod;
                    v[k]=0;
                }
            }
        }
        else
        {
            for(int k=j+1;k<=n;++k)
            {
                if(v[k]==0)
                {
                    v[k]=1;
                    max=(max%mod+val(s,i+1,k,n,dp)%mod)%mod;
                    v[k]=0;
                }
            }
        }
        return dp[i][j]=max;
    }
    public int numPermsDISequence(String s) 
    {
        int n=s.length();
        int dp[][]=new int[n+10][n+10];
        v=new int[n+10];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);   
        }
        int max=0;
        for(int i=0;i<=n;i++)
        {
            v[i]=1;
            max=(max%mod+val(s,0,i,n,dp)%mod)%mod;
            v[i]=0;
            
        }
        return max;
    }
}