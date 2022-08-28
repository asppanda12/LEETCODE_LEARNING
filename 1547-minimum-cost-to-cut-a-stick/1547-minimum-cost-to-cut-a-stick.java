class Solution 
{
    public static int val(int cuts[],int pos,int j,int dp[][])
    {
        // System.out.println(pos+" "+j);
        if(pos==j-1)        
        {
            return 0;
        }
        if(dp[pos][j]!=-1)
        {
            return dp[pos][j];
        }
        int min=10000000;
        for(int i=pos+1;i<j;i++)
        {
            int left=val(cuts,pos,i,dp);
            int right=val(cuts,i,j,dp);
            min=Math.min(min,left+right+(cuts[j]-cuts[pos]));
        }
        return dp[pos][j]=min;
    }
    public int minCost(int n, int[] cuts) 
    {
        Arrays.sort(cuts);
        int cuts1[]=new int[cuts.length+2];
        cuts1[0]=0;
        for(int i=0;i<cuts.length;i++)
        {
            cuts1[i+1]=cuts[i];
        }
        cuts1[cuts.length+1]=n;
        int dp[][]=new int[cuts.length+3][cuts.length+3];
        for(int i=0;i<=cuts.length;i++)
        {
                 Arrays.fill(dp[i],-1);
        }
        return val(cuts1,0,cuts.length+1,dp);
        
    }
}