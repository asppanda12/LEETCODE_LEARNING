class Solution {
    public List<Integer> goodIndices(int[] nums, int k) 
    {
        int n=nums.length;
        int inc[]=new int[n];
        int dec[]=new int[n];
        dec[0]=1;
        for(int i=1;i<n;i++)
        {
             if(nums[i-1]>=nums[i])
             {
                 dec[i]=dec[i-1]+1;
             }
            else
            {
                dec[i]=1;
            }
        }
        inc[n-1]=1;
         for(int i=n-2;i>=0;i--)
        {
             if(nums[i]<=nums[i+1])
             {
                 inc[i]=inc[i+1]+1;
             }
             else
             {
                 inc[i]=1;
             }
        }
        // System.out.println(Arrays.toString(dec));
        // System.out.println(Arrays.toString(inc));    
      List<Integer> ls=new ArrayList<Integer>();
        for(int i=1;i<n-1;i++)
        {
            if(dec[i-1]>=k && inc[i+1]>=k)
            {
                ls.add(i);
            }
        }
        return ls;
      
    
    }
}