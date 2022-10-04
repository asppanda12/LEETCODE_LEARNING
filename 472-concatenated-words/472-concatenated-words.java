class Solution
{
    public static int check(String s,int pos,int j,int n,HashSet<String> set,int dp[][])
    {
        if(pos>=j)
        {
            return 1;
        }
        int flag=0;
        if(dp[pos][j]!=-1)
        {
            return dp[pos][j];
        }
        for(int i=pos;i<j;i++)
        {
            String s1=s.substring(pos,i+1);
            if(s1.equals(s)==false)
            {
            int flag1=set.contains(s1)==true?1:0;
            flag1&=check(s,i+1,j,n,set,dp);
            flag|=flag1;
            }
        }
        return dp[pos][j]=flag;
        
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) 
    {
        HashSet<String> set=new HashSet<String>();
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            set.add(words[i]);
        }
        List<String> ls=new ArrayList<String>();
        
        for(int i=0;i<n;i++)
        {
            int dp[][]=new int[words[i].length()+1][words[i].length()+2];
            for(int j=0;j<words[i].length();j++)
            {
                Arrays.fill(dp[j],-1);
            }
            if(check(words[i],0,words[i].length(),words[i].length(),set,dp)==1)
            {
                ls.add(words[i]);
            }
        }
        
        return ls;
    }
}