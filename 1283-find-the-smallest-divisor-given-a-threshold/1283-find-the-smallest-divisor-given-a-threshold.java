class Solution 
{
    public static boolean validate(int[] nums,int threshold,int val)
    {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+(int)Math.ceil(nums[i]/(double)val);
        }
        if(sum<=threshold)
        {
            return true;
        }
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold)
    {
        int low=1;int high=(int)(1e6);
        while(low<high)
        {
            int mid=(low+high)>>1;
            if(validate(nums,threshold,mid))
            {
               high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    }
}