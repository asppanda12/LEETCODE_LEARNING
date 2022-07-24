class Solution 
{
    public static boolean check(int i,int j,int n,int m)
    {
        if(i<n && i>=0 && j<m && j>=0)
        {
            return true;
        }
        return false;
    }
    public static void dfs(char[][] grid,int i,int j,int n,int m,int v[][])
    {
        
         v[i][j]=1;
        if(check(i+1,j,n,m)==true && v[i+1][j]==0 && grid[i+1][j]=='1')
        {
            dfs(grid,i+1,j,n,m,v);
        }
        if(check(i-1,j,n,m)==true && v[i-1][j]==0 && grid[i-1][j]=='1')
        {
            dfs(grid,i-1,j,n,m,v);
        }
        if(check(i,j+1,n,m)==true && v[i][j+1]==0 && grid[i][j+1]=='1')
        {
            dfs(grid,i,j+1,n,m,v);
        }
        if(check(i,j-1,n,m)==true && v[i][j-1]==0 && grid[i][j-1]=='1')
        {
            dfs(grid,i,j-1,n,m,v);
        }
    }
    public int numIslands(char[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int v[][]=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                if(v[i][j]==0 && grid[i][j]=='1')
                {
                    dfs(grid,i,j,n,m,v);
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}