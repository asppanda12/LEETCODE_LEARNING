class Solution {
    public boolean matchReplacement(String s, String sub, char[][] mappings) 
    {
       int n=s.length();
       int m=sub.length();
        HashMap<Character,HashSet<Character>> map=new HashMap<Character,HashSet<Character>>();
        for(int i=0;i<mappings.length;i++)
        {
            if(map.containsKey(mappings[i][0])==false)
            {
                map.put(mappings[i][0],new HashSet<Character>());
            }
            map.get(mappings[i][0]).add(mappings[i][1]);
        }
       for(int i=0;i<=n-m;i++)
       {
           String s1=s.substring(i,i+m);
           int l=0;int c=0;
           while(l<m)
           {
              
               if(s1.charAt(l)!=sub.charAt(l))
               {
                  if(map.containsKey(sub.charAt(l))==true && map.get(sub.charAt(l)).contains(s1.charAt(l))==true)
                  {
                      c++;
                  }
               }
               else
                if(s1.charAt(l)==sub.charAt(l))
                {
                    c++;
                }
               else
               {
                   break;
               }
               l++;
           }
           if(c==sub.length())
           {
               return true;
           }
       }
        return false;
    }
}