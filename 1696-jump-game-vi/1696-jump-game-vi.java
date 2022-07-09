class Solution {
   static class Pair implements Comparable<Pair>
	{
		int x;
		int y;
		Pair(int x,int y)
		{
			this.x=x;
			this.y=y;
	    }
		
		public int compareTo(Pair o)
		{
			return this.x - o.x;
		}
	}
	 public static int maxResult(int[] a, int k)
	  {
		 PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
		 int n=a.length;
         if(n==1)
         {
             return a[0];
         }
		 pq.add(new Pair(a[0],0));
		 for(int i=1;i<(n-1);)
		 {

			 if((Math.abs(pq.peek().y-i))<=k)
			{
				 
				int sum=pq.peek().x+a[i];
			
				pq.add(new Pair(sum,i));
				i++;
			}
			else
			{
		
     			pq.poll();
     			
			}
		 }
		 int sum=0;
		 while(pq.isEmpty()==false)
		 {
			 int x=pq.peek().y;
			 if(((n-1)-x)<=k)
			 {
				 sum=pq.peek().x+a[n-1];
				 break;
			 }
			 else
			 {
				 pq.poll();
			 }
	
		 }
		 return sum;
		 
	        
	    
	  }
}