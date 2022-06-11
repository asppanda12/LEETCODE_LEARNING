class Solution 
{
    public int val(int n,int i,int k,ArrayList<String> ar,int dp[][],String s)
    {
        if(k==n)
        {
            return 1;
        }
        if(dp[i][k]!=-1)
        {
            return dp[i][k];
        }
        int sum=0;
        for(int j=i;j<ar.size();j++)
        {
            sum+=val(n,j,k+1,ar,dp,s+ar.get(i));
        }
        return dp[i][k]=sum;
    }
    public int countVowelStrings(int n)
    {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("a");arr.add("e");arr.add("i");arr.add("o");arr.add("u");
    
        int dp[][]=new int[6][n];
        
        for(int i=0;i<6;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return val(n,0,0,arr,dp,"");
        
    }
}