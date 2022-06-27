class Solution {
    public int findCenter(int[][] edges)
    {
       int a[]=new int[1000000];
       for(int i=0;i<edges.length;i++)
       {
           a[edges[i][0]]++;
           a[edges[i][1]]++;
       }
        int max=0;int ind=0;
        for(int i=0;i<1000000;i++)
        {
            if(max<a[i])
            {
                max=a[i];
                ind=i;
            }
        }
        return ind;
    }
}