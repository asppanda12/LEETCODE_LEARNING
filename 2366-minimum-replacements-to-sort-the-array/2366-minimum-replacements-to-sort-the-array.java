class Solution 
{
    public static int ceil(int x,int y)
    {
        if(x%y==0)
        {
            return x/y;
        }
        else
        {
            return x/y+1;
        }
    }
    public long minimumReplacement(int[] nums)
    {
        int n=nums.length;
        int min=nums[n-1];
        long cnt=0;
        for(int i=n-2;i>=0;i--)
        {
           int val=ceil(nums[i],min);
           if(nums[i]%min!=0)
           {
               min=nums[i]/val;
           }
          cnt+=val-1;
        }
        return cnt;
        
    }
}