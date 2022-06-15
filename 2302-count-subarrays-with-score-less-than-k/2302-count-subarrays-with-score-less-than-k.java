class Solution 
{
    public long countSubarrays(int[] nums, long k) 
    {
        int n=nums.length;
        int start=0;int end=0;
        long ans=0;
        long sum=0;
        while(end<n)
        {
                   sum=sum+nums[end];
            while((long)((end-start+1)*(sum))>=k)
            {
                if(nums[start]<k)
                {
                ans=ans+(long)(end-start);
                }
                sum=sum-nums[start];
                start++;
            }
            end++;
           
            
        }
        long val=end-start;
        val=(long)val*(long)(val+1)/2;
        return ans+val;
        
    }
}