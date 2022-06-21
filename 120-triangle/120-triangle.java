class Solution 
{
    public static int val(List<List<Integer>> triangle,int i,int j,int n,int dp[][])
    {
        if(i==n-1 && j<triangle.get(i).size())
        {
            return triangle.get(i).get(j);
        }
        
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        if(i+1<n)
        {
                
            min=Math.min(val(triangle,i+1,j,n,dp),min);
        }
        if(i+1<n && j+1<triangle.get(i+1).size())
        {
              min=Math.min(val(triangle,i+1,j+1,n,dp),min);
        }
    
        dp[i][j]=min==Integer.MAX_VALUE?min:triangle.get(i).get(j)+min;
       
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        
        
        int dp[][]=new int[206][206];
        for(int i=0;i<206;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return val(triangle,0,0,triangle.size(),dp);
        
    }
}