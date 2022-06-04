class MyCalendarTwo 
{
    
TreeMap<Integer,Integer> map;
    public MyCalendarTwo() 
    {
        map=new TreeMap<Integer,Integer>();
        
    }
    
    public boolean book(int start, int end) 
    {
         map.put(start,map.getOrDefault(start,0)+1);
         map.put(end,map.getOrDefault(end,0)-1);
        int d=0;
        for(Integer ap:map.values())
        {
            d=d+ap;
            if(d>=3)
            {
                map.replace(start,map.get(start)-1);
                map.replace(end,map.get(end)+1);
                return false;
            }
           
        }
        return true;
    }
}