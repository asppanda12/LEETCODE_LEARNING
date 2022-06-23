class Solution 
{
   class Pair implements Comparable<Pair> {
		int x;
		int y;
        int z;
		Pair(int x, int y,int z) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Pair o) 
        {
            if(o.y==this.y)
            {
                return this.x-o.x;
            }
			return this.y - o.y;
		}
	}
    public int scheduleCourse(int[][] courses)
    {
        int n=courses.length;
        PriorityQueue<Integer> queue=new  PriorityQueue<Integer>(Collections.reverseOrder());
        Arrays.sort(courses, (a, b) -> (a[1] - b[1]));
        int k=0;
        int t=0;
        
        for(int i=0;i<n;i++)
        {
    
            if(t+courses[i][0]<=courses[i][1])
            {
                t+=courses[i][0];
                queue.add(courses[i][0]);
            }
            else
            if(!queue.isEmpty() && queue.peek()>courses[i][0])
            {
                t+=courses[i][0]-queue.poll();
                queue.add(courses[i][0]);
            }
        }
        
        return queue.size();
        
    }
}