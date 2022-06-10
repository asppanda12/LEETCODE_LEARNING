class Solution 
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> adj1=new ArrayList<Integer>();
        adj1.add(1);
        arr.add(adj1);
        if(numRows==1)
        {
            return arr;
        }
         adj1=new ArrayList<Integer>();
        adj1.add(1);
        adj1.add(1);
        arr.add(adj1);
        if(numRows==2)
        {
            return arr;
        }
        for(int i=2;i<numRows;i++)
        {
            List<Integer> adj=new ArrayList<Integer>();
            int ind=1;
            adj.add(1);
            for(int j=1;j<arr.get(i-1).size();j++)
            {
                adj.add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
            }
            adj.add(1);
            arr.add(adj);
        }
        return arr;
        
    }
}