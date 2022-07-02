import java.util.*;
class Solution 
{
     int mod=1000000007;
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts)
    {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long max=h-horizontalCuts[horizontalCuts.length-1];
        long max1=w-verticalCuts[verticalCuts.length-1];
        for(int i=1;i<horizontalCuts.length;i++)
        {
            max=Math.max((horizontalCuts[i]-horizontalCuts[i-1])%mod,max);
        }
        max=Math.max(horizontalCuts[0],max);
         for(int i=1;i<verticalCuts.length;i++)
        {
            max1=Math.max((verticalCuts[i]-verticalCuts[i-1])%mod,max1);
        }
        max1=Math.max(verticalCuts[0],max1);
        return (int)(((max1)%mod)*((max)%mod)%mod);
        
        
        
    }
}