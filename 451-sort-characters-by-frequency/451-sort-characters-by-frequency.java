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
    
    public String frequencySort(String s) 
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
                   StringBuilder s1=new  StringBuilder();
        while(pq.isEmpty()==false)
                   {
                       char ch=pq.peek().x;
                       int no=pq.peek().y;
                       for(int i=0;i<no;i++)
                       {
                           s1.append(ch);
                       }
                       pq.poll();
                   }
                   return s1.toString();
    }
}