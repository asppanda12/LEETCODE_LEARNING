class Solution
{
    class Pair
    {
        int x;int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public int[][] merge(int[][] intervals) 
    {
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       int min=intervals[0][0];int max=intervals[0][1];
        int n=intervals.length;
        int t=0;
        ArrayList<Pair> arr=new ArrayList<Pair>();
       for(int i=1;i<n;i++)
       {
           if(max>=intervals[i][0])
           {
               max=Math.max(max,intervals[i][1]);
           }
           else
           {
               arr.add(new Pair(min,max));
               min=intervals[i][0];
               max=intervals[i][1];
           }
       }
     arr.add(new Pair(min,max));
   int ans[][]=new int[arr.size()][2];    
    for(int i=0;i<arr.size();i++)
    {
        ans[i][0]=arr.get(i).x;
        ans[i][1]=arr.get(i).y;
    }
        return ans;
    
    
    }
}