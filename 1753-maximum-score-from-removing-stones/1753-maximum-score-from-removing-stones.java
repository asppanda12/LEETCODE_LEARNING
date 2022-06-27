class Solution 
{
    
   public static int maximumScore(int a, int b, int c)
	    {
		  PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		  pq.add(a);pq.add(b);pq.add(c);
		  int c1=0;
		  while(pq.size()>1)
		  {
			  
			  int t=pq.peek()-1;pq.poll();
			  int q=pq.peek()-1;pq.poll();
			  c1++;
			 if(t!=0)
			 {
				 pq.add(t);
			 }
			 if(q!=0)
			 {
				 pq.add(q);
			 }
			
		  }
		return c1;
	    }
}