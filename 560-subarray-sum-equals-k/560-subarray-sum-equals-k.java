class Solution 
{
    public int subarraySum(int[] nums, int k)
    {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            map.put(sum,map.getOrDefault(sum,0)+1);
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                cnt+=map.get(sum-k);
            }
        }
        return cnt;
        
    }
}