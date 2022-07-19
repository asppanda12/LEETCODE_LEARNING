class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new ArrayDeque();
        Deque<Integer> min = new ArrayDeque();
        int j = 0, res = 1;
        for (int i = 0; i < nums.length; ++i) {
            while (!max.isEmpty() && max.peekLast() < nums[i])
                max.removeLast();
            
            max.addLast(nums[i]);
            while (!min.isEmpty() && min.peekLast() > nums[i])
                min.removeLast();
            
            min.addLast(nums[i]);
            while (j < nums.length && max.peekFirst() - min.peekFirst() > limit) {
                if (max.peekFirst() == nums[j])
                    max.pollFirst();
                if (min.peekFirst() == nums[j])
                    min.pollFirst();
                
                ++j;
            }
            
            res = Math.max(res, i - j + 1);
        }
        
        return res;
    }
}