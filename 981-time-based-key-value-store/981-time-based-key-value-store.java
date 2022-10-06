class TimeMap {
    HashMap<String,TreeSet<Integer>> map;
    HashMap<Integer,String> redirect;
    public TimeMap() 
    {
       map=new HashMap<String,TreeSet<Integer>>();
       redirect=new HashMap<Integer,String>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        if(map.containsKey(key)==false)
        {
            map.put(key,new TreeSet<Integer>());
        }
        map.get(key).add(timestamp);
        redirect.put(timestamp,value);
    }
    
    public String get(String key, int timestamp) 
    {
        if(map.containsKey(key)==false)
        {
            return "";
        }
        TreeSet<Integer> set=map.get(key);
        if(set.floor(timestamp)==null)
        {
            return "";
        }
        int ind=set.floor(timestamp);
        
        if(redirect.containsKey(ind)==false)
        {
            return "";
        }
        return redirect.get(ind);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */