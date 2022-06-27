class Solution {
    public int minPartitions(String s)
    {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(s.charAt(i)-'0',max);
        }
        return max;
    }
}