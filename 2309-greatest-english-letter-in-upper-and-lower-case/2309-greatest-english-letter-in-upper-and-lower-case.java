class Solution {
    public String greatestLetter(String s)
    {
        int n=s.length();
        int u[]=new int[26];
        int l[]=new int[26];
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                u[(int)(ch-'A')]++;
            }
            
            if(Character.isLowerCase(ch))
            {
                l[(int)(ch-'a')]++;
            }
        }
        String s1="";
        for(int i=0;i<26;i++)
        {
            if(u[i]>0 && l[i]>0)
            {
                s1="";
                s1=s1+(char)(i+'A');
            }
        }
        return s1;
    }
}