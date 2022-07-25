class Solution
{
    public long maximumImportance(int n, int[][] roads)
    {
    int indegree[]=new int[n];
        for(int i=0;i<roads.length;i++)
        {
            indegree[roads[i][0]]++;
            indegree[roads[i][1]]++;
        }
        Arrays.sort(indegree);
        long sum=0;int t=n;
        for(int i=n-1;i>=0;i--)
        {
            sum+=(long)((long)t*(long)indegree[i]);
            t--;
        }
        return sum;
    }
}