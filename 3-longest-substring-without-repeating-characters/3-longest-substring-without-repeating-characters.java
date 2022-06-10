class Solution 
{
    public static boolean check(HashMap<Character,Integer> map)
    {
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if(m.getValue()>1)
            {
                return false;
            }
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s)
    {
        int n=s.length();
        int start=0;int end=-1;
HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int max=0;
    while(end<n)
        {
        
                while(check(map)==false)
                {
                    map.replace(s.charAt(start),map.get(s.charAt(start))-1);
                        //map[s[start]]--;
                    start++;
                }
         
          max=Math.max(end-start+1,max);
        end++;
             if(end<n)
             {
                 map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
                 //map[s[end]]++;
             }
        }
      
        return max;
    }
}