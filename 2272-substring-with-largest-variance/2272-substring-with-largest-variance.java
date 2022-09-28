class Solution 
{
    public int largestVariance(String s) 
    {
        int n=s.length();int max1=0;
        int last_ind[]=new int[26];
        Arrays.fill(last_ind,-1);
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            last_ind[(int)(ch-'a')]=i;
        }
        for(int max=0;max<26;max++)
        {
            for(int min=0;min<26;min++)
            {
                char mach=(char)(max+97);
                char mich=(char)(min+97);
 if(mich!=mach || last_ind[mich-'a']!=-1 || last_ind[mach-'a']!=-1)
                {
                int mac=0;int mic=0; 
                for(int i=0;i<n;i++)
                {
                    if(mach==s.charAt(i))
                    {
                        mac++;
                    }
                    else
                    if(mich==s.charAt(i))
                    {
                        mic++;
                    }
                    if(mac<mic &&  last_ind[mich-'a']!=i)
                    {
                        mic=0;
                        mac=0;
                    }
                    if(mac>0 && mic>0)
                    {
                    max1=Math.max(max1,mac-mic);
                    }
                } 
                }
            }
        }
        return max1;
           
}
}