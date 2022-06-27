class Solution 
{
    public static boolean check(int i,int j,int n,int m)
    {
        if(i>=0 && i<n && j>=0 && j<m)
        {
            return true;
        }
        return false;
        
    }
    public static void res(int[][] image,int sr,int sc,int color,int n,int m,int val,int v[][])
    {
        if(sr>=n || sc>=m ||sr<0 || sc<0)
        {
            return;
        }
        v[sr][sc]=1;
        if(val==image[sr][sc])
        {
            image[sr][sc]=color;
            if(check(sr+1,sc,n,m)==true && v[sr+1][sc]==0)
            res(image,sr+1,sc,color,n,m,val,v);
            if(check(sr,sc+1,n,m)==true && v[sr][sc+1]==0)
            res(image,sr,sc+1,color,n,m,val,v);
            if(check(sr-1,sc,n,m)==true && v[sr-1][sc]==0)
            res(image,sr-1,sc,color,n,m,val,v);
            if(check(sr,sc-1,n,m)==true && v[sr][sc-1]==0)
            res(image,sr,sc-1,color,n,m,val,v);
        }
    }
        
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int n=image.length;
        int m=image[0].length;
        int v[][]=new int[n][m];
 res(image,sr,sc,color,n,m,image[sr][sc],v);
        return image;
    }
}