class Solution
{
    public static int gcd(int a,int b)
    {
          return b == 0 ? a : gcd(b, a % b);   
    }
    public int minOperations(int[] nums, int[] numsDivide) 
    {
        Arrays.sort(nums);
        int n=numsDivide.length;
        int g=numsDivide[0];
        for(int i=0;i<n;i++)
        {
            g=gcd(g,numsDivide[i]);
        }
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(g%nums[i]==0)
            {
                break;
            }
            c++;
            
        }
        if(c==nums.length)
        {
            return -1;
        }
        return c;
    }
}