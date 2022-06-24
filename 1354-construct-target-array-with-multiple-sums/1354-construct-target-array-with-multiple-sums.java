class Solution {
    public boolean isPossible(int[] target)
    {
        if (target.length == 1) return target[0] == 1;
        int n=target.length;
        long sum=0;
        
        PriorityQueue<Long> pq=new PriorityQueue<Long>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            sum+=target[i];
            pq.add((long)target[i]);
        }
        while(pq.isEmpty()==false)
        {
             if(pq.peek()==1)
             {
                 pq.poll();
                 continue;
             }
            
                  long cur=pq.peek();
            if (sum - cur == 1) return true;
                 pq.poll();
                  long val=cur%(sum-cur);
                 sum=sum-cur+val;
                  if(val==0 || val==cur)
                  {
                      return false;
                  }
                 else
                 {
                     pq.add(val);
                 }
                 
             
        }
        return true;
        
    }
}