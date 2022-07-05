class Solution {
    public int longestConsecutive(int[] nums)
    {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int longestStreak=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int current=num;
                int streak=1;
                while(set.contains(current+1))
                {
                    current+=1;
                    streak+=1;
                }
                longestStreak=Math.max(longestStreak,streak);
            }
        }
        return longestStreak;
        
        
    }
}