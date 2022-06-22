class Solution
{
    public int findKthLargest(int[] nums, int k) 
    { 
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            pq.add(nums[i]);
        }
        k-=1;
        while(k-->0)
        {
            pq.poll();
        }
        return pq.peek();
        
    }
}