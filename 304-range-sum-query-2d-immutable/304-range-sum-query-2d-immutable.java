class NumMatrix {
 int dp[][];
    public NumMatrix(int[][] matrix) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
          dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            dp[i][0]=matrix[i][0];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[i][j]=dp[i][j-1]+matrix[i][j];
            }
        }
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
        int sum=0;
        for(int j=row1;j<=row2;j++)
        {
            if(col1!=0)
            sum+=dp[j][col2]-dp[j][col1-1];
            else
            sum+=dp[j][col2];
        }
        return sum;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */