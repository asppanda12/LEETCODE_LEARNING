class Solution {
    public int maxArea(int[] height)
    {
        int n=height.length;
        int i=0;
        int j=n-1;
        int max=0;
        while(i<j)
        {
            
                max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j])
            {
                i++;
            }
            else
            if(height[i]>height[j])
            {
              j--;
            }
            else
            {
                i++;
            }
            
        }
        return max;
        
    }
}