class Solution
{
    public String shiftingLetters(String s, int[] shifts) 
    {
        int n=s.length();
        String s1="";
        long sum=0;
        long dp[]=new long[n];
        for(int i=n-1;i>=0;i--)
        {
            sum+=shifts[i];
            dp[i]=sum;
        }
         StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            long val=(long)(s.charAt(i)-'a')+dp[i];
            int ch=(int)((val)%26);
           sb.append((char)(97+ch));
        }
  return sb.toString();        
    }
}
