class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int start=0;
        int end=0;
        int n=nums.length;
        double max=Integer.MIN_VALUE;
        double sum=0.0;
        while(end<n)
        {

            sum=sum+nums[end];
        if(end-start+1==k)
        {
            max=Math.max(sum/(double)k,max);
            sum=sum-nums[start];
            start++;
        }
          end++;

        }
        return max;
    }
}