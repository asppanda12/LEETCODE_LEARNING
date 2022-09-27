class Solution 
{
    
    public int longestSubarray(int[] nums) 
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }
        int max1=0;int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                cnt++;
            }
            else
            {
                cnt=0;
            }
            max1=Math.max(cnt,max1);
        }
        return max1;
    }
}