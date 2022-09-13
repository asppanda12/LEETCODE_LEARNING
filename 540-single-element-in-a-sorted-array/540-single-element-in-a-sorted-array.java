class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int n=nums.length;
        int lo=0;int hi=n-1;
       while(lo<hi)
       {
           int mid=(lo+hi)/2;
           if(mid%2==0)
           {
               if(mid>0 && nums[mid]==nums[mid-1])
               {
                   hi=mid-1;
               }
               else
               if(mid<n && nums[mid]==nums[mid+1])
               {
                   lo=mid+1;
               }
               else
               {
                   return nums[mid];
               }
           }
           else
           {
               if(mid>0 && nums[mid]==nums[mid-1])
               {
                   lo=mid+1;
               }
               else
               if(mid<n && nums[mid]==nums[mid+1])
               {
                   hi=mid-1;
               }
               else
               {
                   return nums[mid];
               }
           }
       }
        return nums[lo];
        
    }
}