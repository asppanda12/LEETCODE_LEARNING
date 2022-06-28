class Solution {
    public int minimumDeletions(int[] nums) 
    {
        int n=nums.length;
        int ma_ind=0;
        int max=Integer.MIN_VALUE;
        int mi_ind=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<nums[i])
            {
                ma_ind=i;
                max=nums[i];
            }
            if(min>nums[i])
            {
                mi_ind=i;
                min=nums[i];
            }
        }
        int min1=Math.max(ma_ind,mi_ind)+1;
        int min2=ma_ind+n-mi_ind+1;
        int min3=Math.max(n-ma_ind,n-mi_ind);
        int min4=n-ma_ind+mi_ind+1;
         return Math.min(min1,Math.min(min2,Math.min(min3,min4)));
    }
}