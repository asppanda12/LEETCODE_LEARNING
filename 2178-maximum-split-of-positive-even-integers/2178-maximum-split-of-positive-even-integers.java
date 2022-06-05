class Solution 
{
static int LowerBound(ArrayList<Long> a, long x) { // x is the target value or key
  int l=-1,r=a.size();
  while(l+1<r) {
    int m=(l+r)>>>1;
    if(a.get(m)>=x) r=m;
    else l=m;
  }
  return r;
}
    public List<Long> maximumEvenSplit(long finalSum) 
    {
        ArrayList<Long> arr=new ArrayList<Long>();
        List<Long> res=new ArrayList<Long>();
        for(int i=2;i<1000000;i=i+2)
        {
            arr.add((long)i);
        }
        if(finalSum%2!=0)
        {
            return res;
        }
        
        long val=(int)Math.ceil((-1+(double)Math.ceil(Math.sqrt(1+4*finalSum)))/(double)2);
        
        if(val*val+val==finalSum)
        {
            for(int i=0;i<val;i++)
            {
                res.add((long)(arr.get(i)));
            }
            return res;
        }
        else
        {
            long rem=val*val+val-finalSum;
            HashSet<Long> set=new HashSet<Long>();
            while(rem!=0)
            {
                 int ind=LowerBound(arr,rem);
                set.add(arr.get(ind));
                rem=rem-arr.get(ind);
            }
            for(int i=0;i<val;i++)
            {
                if(set.contains(arr.get(i))==false)
                {
                    res.add(arr.get(i));
                }
            }
            return res;
        }
    }
}