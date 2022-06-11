class Solution 
{
    public static int val(String s,int pos,int j,HashMap<String,String> map,int dp[])
    {
        if(pos>=j)
        {
            return 1;
        }
        if(dp[pos]!=-1)
        {
            return dp[pos];
        }
        int total=0;
        for(int i=pos;i<s.length();i++)
        {
            String s1=s.substring(pos,i+1);
            if(map.containsKey(s1)==true)
            {
                total+=val(s,i+1,j,map,dp);
            }
        }
        return dp[pos]=total;
    }
    public int numDecodings(String s) 
    {
        
        HashMap<String,String> map=new HashMap<String,String>();
        for(int i=1;i<=26;i++)
        {  
           map.put(Integer.toString(i),"A");
        }
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp,-1);
        return val(s,0,s.length(),map,dp);
    }
}