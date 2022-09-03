class Solution
{
    static List<List<Integer>> arr1;
    public static void dfs(List<List<Integer>> arr,int src,int dst,int v[],List<Integer> ls)
    {
        if(src==dst)
        {
            ls.add(dst);
            // System.out.println(ls);
            arr1.add(ls);
            System.out.println(arr);
            return;
        }
        v[src]=1;
        for(Integer s:arr.get(src))
        {
            
            if(v[s]==0)
            {
                        List<Integer> ar=new ArrayList<Integer>(ls);
                ar.add(src);
                dfs(arr,s,dst,v,ar);
            }
        }
                        v[src]=0;

    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph)
    {
        int n=graph.length;
        arr1=new ArrayList<>();
        List<List<Integer>> ap=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ap.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
        {
            for(Integer val:graph[i])
            {
                ap.get(i).add(val);
            }
        }
        int v[]=new int[n];
        List<Integer> ls=new ArrayList<Integer>();
        dfs(ap,0,n-1,v,ls);
        return arr1;
    }
}