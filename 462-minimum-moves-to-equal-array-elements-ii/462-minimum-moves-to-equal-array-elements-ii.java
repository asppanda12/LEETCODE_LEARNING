class Solution {
    public int minMoves2(int[] nums)
    {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;int median=nums[n/2];
        for(int i=0;i<n;i++)
        {
            sum+=Math.abs(nums[i]-median);
        }
        return sum;
        
    }
}