class Solution 
{
    public static void ans(int pre,int n,int k,String s,HashSet<String> set)
    {
        if(s.length()>n)
        {
            return;
        }
        if(s.length()==n)
        {
            set.add(s);
            return;
        }
        if(pre<0 || pre>=10)
        {
            return;
        }
        ans(pre+k,n,k,s+pre,set);
        ans(pre-k,n,k,s+pre,set);
        
    }
    public int[] numsSameConsecDiff(int n, int k) 
    {
        HashSet<String> set=new HashSet<String>();
        for(int i=1;i<=9;i++)
        {
            ans(i+k,n,k,Integer.toString(i),set);
            ans(i-k,n,k,Integer.toString(i),set);
        }
        int kpos[]=new int[set.size()];
        int t=0;
        for(String s:set)
        {
            kpos[t++]=Integer.parseInt(s);
        }
        return kpos;
    }
}