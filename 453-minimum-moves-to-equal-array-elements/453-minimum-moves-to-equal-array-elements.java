class Solution {
   public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int e: nums)
            min = Math.min(min, e);
        
        int count = 0;
        
        for(int e: nums)
            count += e-min;
        
        return count;
    }
}
