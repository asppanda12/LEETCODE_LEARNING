class Solution {
    public int maximumUniqueSubarray(int[] nums) 
    {
        int n=nums.length;
        int start=0;int end=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      
        int sum=0;int max=0;
        while(end<n)
        {
            sum=sum+nums[end];
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.containsKey(nums[end])==true && map.get(nums[end])>1)
            {
                sum-=nums[start];
                map.replace(nums[start],map.get(nums[start])-1);
                start++;
            }
            max=Math.max(sum,max);
            end++;
        }
        return max;
        
    }
}