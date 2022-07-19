class Solution {
       public static int longestSubarray(int[] nums, int limit)
    {
    	int n=nums.length;
    	PriorityQueue<Integer> min=new PriorityQueue<Integer>();
    	PriorityQueue<Integer> max=new PriorityQueue<Integer>(Collections.reverseOrder());
    	int low=0;int high=0;
    	
    	int pre=-1;
    	int dp[]=new int[n];
    	Arrays.fill(dp,1);
    	int maxi=0;
    	for(int i=0;i<nums.length;i++)
    	{
    		
    		min.add(nums[i]);
        	max.add(nums[i]);
        	while(Math.abs(max.peek()-min.peek())>limit)
        	{
        		min.remove(nums[low]);
        		max.remove(nums[low]);
        		low++;
        	}
       
        	maxi=Math.max(high-low+1, maxi);
        	high++;
    	}
    	return maxi;
            
    }
}