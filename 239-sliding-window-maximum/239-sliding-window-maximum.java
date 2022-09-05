class Solution {
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<Integer>();
        int start=0;int end=-1;
        int res[]=new int[nums.length-k+1];
        int t=0;
        while(end<n)
        {
            if(end-start+1==k)
            {
                res[t++]=dq.peekFirst();
                if(dq.peekFirst()==nums[start])
                {
                    dq.pollFirst();
                }
                start++;
            }
            else
            {
                end++;
                if(end<n)
                {
                while(dq.isEmpty()==false && dq.peekLast()<nums[end])
                {
                    dq.pollLast();
                }
                    dq.offerLast(nums[end]);
                }
            }
        }
        
        return res;
        
    }
}