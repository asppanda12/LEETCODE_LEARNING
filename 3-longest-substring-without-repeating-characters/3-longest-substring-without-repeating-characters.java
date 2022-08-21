class Solution 
{
    
    public int lengthOfLongestSubstring(String s)
    {
          int n=s.length();
          HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int start=0;int end=-1;
        int max=0;
        while(end<n)
        {
            while(end-start+1>map.size())
            {
                if(map.get(s.charAt(start))>1)
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                else
                map.remove(s.charAt(start));
                start++;
            }
            max=Math.max(end-start+1,max);
            end++;
            if(end<n)
            {
                 map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            }
        }
        return max;
        
    }
}