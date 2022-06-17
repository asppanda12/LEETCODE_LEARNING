class Solution {
    
    
    
    public long minimumPerimeter(long neededApples) {
        if (neededApples == 0) {
            return 0L;
        }
        
        long left = 1;
        long right = 100000;
        
        while (left < right) {
            long middle = (right - left) / 2 + left;
            
            if (appleCount(middle) < neededApples) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        
        return left * 8;
    }
    
    private long appleCount(long m) {
        return m*m*m*4 + m*m*6 + m*2;
    }
    
}
