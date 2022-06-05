class Solution
{
    public boolean isNStraightHand(int[] hand, int groupSize) 
    {
        int n=hand.length;
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
      for(Map.Entry<Integer,Integer> ma:map.entrySet())
      {
          int key=ma.getKey();
          int val=ma.getValue();
         
          if(val>0)
          {
              for(int i=key;i<key+groupSize;i++)
              {
                  if(map.containsKey(i)==false||map.get(i)<val)
                  {
                      return false;
                  }
                  map.replace(i,map.get(i)-val);
              }
          }
      }
        return true;
        
    }
}