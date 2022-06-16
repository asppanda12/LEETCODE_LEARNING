class Solution 
{
    public int search(int[] nums, int target)
    {
        if(nums.length==1)
        {
            if(nums[0]==target)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
       int lo=0;int hi=nums.length-1;
        while(lo<hi)
        {
            int mid=(lo+hi)/2;
             if(nums[lo]==target)
             {
                 return lo;
             }
            
             if(nums[hi]==target)
             {
                 return hi;
             }
             if(nums[mid]==target)
             {
                 return mid;
             }
              if(lo==mid ||  hi==mid)
              {
                  lo=mid+1;
              }
             if(nums[lo]>nums[mid] && nums[hi]>nums[mid])
             {
                 if(nums[hi]>=target && target>nums[mid])
                 {
                     lo=mid+1;
                 }
                 else
                 {
                     hi=mid-1;
                 }
             }
            else
             if(nums[lo]<nums[mid] && nums[hi]<nums[mid])
             {
                 if(target>=nums[lo] &&  target<nums[mid])
                 {
                     hi=mid-1;
                 }
                 else
                 {
                     lo=mid+1;
                 }
             }
            else
            if(nums[lo]<nums[mid] && nums[mid]<nums[hi])
            {
                if(target<nums[mid])
                {
                    hi=mid-1;
                }
                else
                {
                    lo=mid+1;
                }
            }
        }
        return -1;
}
}