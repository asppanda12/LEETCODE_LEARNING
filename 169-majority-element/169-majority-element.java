class Solution 
{
    public static int lower_bound(int arr[],int x)
    {
          int n=arr.length;
        int l=0;int r=n-1;
              

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>=x)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
        
    }
    public static int Upper_bound(int arr[],int x)
    {
        int n=arr.length;
        int l=0;int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>x)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
        
    }
    public int majorityElement(int[] nums)
    {
         int n=nums.length;
        Arrays.sort(nums);
         for(int i=0;i<n;)
         {
             // System.out.println(Upper_bound(nums,nums[i])+" "+lower_bound(nums,nums[i])+" "+nums[i]);
             if((Upper_bound(nums,nums[i])-lower_bound(nums,nums[i]))>n/2)
             {
                 return nums[i];
             }
             else
             {
                 i=Upper_bound(nums,nums[i]);
             }
         }
        return -1;
    }
}