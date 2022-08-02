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
         int candidate=0;
         int count=0;
         for(int i=0;i<n;i++)
         {
             if(count==0)
             {
                 candidate=nums[i];
             }
            count+=(candidate==nums[i])?1:-1;
         }
        return candidate;
    }
}