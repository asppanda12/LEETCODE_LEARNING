class Solution 
{
    static class Pair implements Comparable<Pair> 
	{
		
		char x;
		int y;
		Pair(char x,int y)
		{
			this.x=x;
			this.y=y;
		}
		public int compareTo(Pair o)
		{
			return this.y-o.y;
		}
	}
    
    public int minDeletions(String s) 
    {
            int n=s.length();
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(Collections.reverseOrder());
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            pq.add(new Pair(m.getKey(),m.getValue()));
        }
        int ans=0;int max=pq.peek().y;
        while(pq.isEmpty()==false)
        {
            if(max<0)
            {
                   break;
            }
           int t=pq.poll().y;
            if(max>t)
            {
                max=t;
            }
           ans+=t-max;
            max=max-1;
        }
         while(pq.isEmpty()==false)
        {
             int t=pq.poll().y;
             ans+=t;
         }
     return ans;
        
    }
}