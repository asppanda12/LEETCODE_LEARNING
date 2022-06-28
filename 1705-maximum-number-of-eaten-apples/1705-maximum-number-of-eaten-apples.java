class Solution 
{
    class Pair implements Comparable<Pair>
    {
        int x;int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        public int compareTo(Pair o)
        {
            return this.y-o.y;
        }
    }
    public int eatenApples(int[] apples, int[] days) 
    {
        int n=apples.length;
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>();
        int t=0;
        for(int i=0;i<n;i++)
        {
            
            if(apples[i]!=0){pq.add(new Pair(apples[i],i+days[i]));}
                        while(!pq.isEmpty()){
                int apple = pq.peek().x;
                int expiration_day = pq.poll().y;
                
                if(expiration_day > i){
                    t++;
                    
                    apple--;
                
                    if(apple > 0 && expiration_day > i)
                        pq.offer(new Pair(apple, expiration_day));
                    
                    break;
                }
                        }

        }

        int day=n;
        while(pq.isEmpty()==false)
        {
            int start=pq.peek().x;
            int end=pq.peek().y;
            pq.poll();
            if(start+day<end)
            {
                t+=start;
                day=start+day;
            }
            else
            {
                t+=end-day;
                day=end;
            }
        }
       
        
    
         return t;
    }
}
