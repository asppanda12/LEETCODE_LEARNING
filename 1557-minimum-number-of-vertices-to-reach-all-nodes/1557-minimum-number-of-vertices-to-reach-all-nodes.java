class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges)
    {
        List<Integer> arr=new ArrayList<Integer>();
        int v[]=new int[n];
        for(List<Integer> edg:edges)
        {
             v[edg.get(1)]=1;
        }
        for(int i=0;i<n;i++)
        {
            if(v[i]==0)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}