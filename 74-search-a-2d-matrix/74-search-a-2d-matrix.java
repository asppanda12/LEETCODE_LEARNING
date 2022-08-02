class Solution 
{
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0;int h=n*m-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            int i=mid/m;
            int j=mid%m;
            if(matrix[i][j]>target)
            {
                h=mid-1;
            }
            else
            if(matrix[i][j]<target)
            {
                l=mid+1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}