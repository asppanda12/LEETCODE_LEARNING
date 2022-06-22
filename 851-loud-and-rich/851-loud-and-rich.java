class Solution 
{
    public static int dfs(ArrayList<ArrayList<Integer>> arr,int src,int res[],int quiet[])
    {
        if(arr.get(src).size()==0)
        {
            return res[src];
        }
        int min=res[src];
        for(Integer s:arr.get(src))
        {
            
            if(res[s]==quiet[s])
            {
                min=Math.min(min,dfs(arr,s,res,quiet));
            }
            else
            {
                min=Math.min(res[s],min);
            }
        }
         res[src]=min;
        return min;
    }
    public int[] loudAndRich(int[][] richer, int[] quiet)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=quiet.length;
        for(int i=0;i<n;i++)
        {
            map.put(quiet[i],i);
        }
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<Integer>());
        }
        int m=richer.length;
        for(int i=0;i<m;i++)
        {
           int rich=richer[i][0];
           int poor=richer[i][1];
           arr.get(poor).add(rich);    
        }
        int res[]=quiet.clone();
        for(int i=0;i<n;i++)
        {
            if(res[i]==quiet[i])
            dfs(arr,i,res,quiet);
        }
        for(int i=0;i<n;i++)
        {
          res[i]=map.get(res[i]);
        }
        return res;
        
    }
}