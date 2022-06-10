class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> arr=new   ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    arr.add(i*m+j);
                }
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            int row=arr.get(i)/m;
            int col=arr.get(i)%m;
            for(int j=0;j<n;j++)
            {
                matrix[j][col]=0;
            }
            for(int j=0;j<m;j++)
            {
                matrix[row][j]=0;
            }
        }
    }
}