class Solution 
{
    public void nextPermutation(int[] nums)
    {
        int n=nums.length;
       if(n==1)
       {
           return;
       }
       int t=-1;
       for(int i=n-1;i>0;i--)
       {
           if(nums[i]>nums[i-1])
           {
               t=i-1;
               break;
           }
       }
    if(t==-1)
    {
       Arrays.sort(nums);
        return;
    }
else
{
    int min=Integer.MAX_VALUE;
    int ind=0;
    for(int i=t+1;i<n;i++)
    {
        if(nums[i]>nums[t])
        {
            min=nums[i];
            ind=i;
        }
    }
    int swap=nums[ind];
    nums[ind]=nums[t];
    nums[t]=swap;
    Arrays.sort(nums,t+1,n);
}
    
    }
}