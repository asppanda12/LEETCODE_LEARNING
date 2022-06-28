class Solution 
{
    static class Pair
    {
        int x;int y;
   public Pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

static class Compare {
	
	static void compare(Pair arr[], int n)
	{
		// Comparator to sort the pair according to second element
		Arrays.sort(arr, new Comparator<Pair>() {
			@Override public int compare(Pair p1, Pair p2)
			{
                if(p1.y==p2.y)
                {
                    return p1.x-p2.x;
                }
				return p1.y - p2.y;
			}
		});
		
	}
}
    public static int maxEvents(int[][] events) 
    {
       Arrays.sort(events,(a,b)->a[1]-b[1]);
    TreeSet<Integer> st=new TreeSet<>();
    for(int i=0;i<=100000;i++)
        st.add(i);
    int ans=0;
    for(int i=0;i<events.length;i++)
    {
        Integer tmp=st.ceiling(events[i][0]);
        if(tmp==null)
            continue;
        if(tmp>=events[i][0] && tmp<=events[i][1])
        {
            ans++;
            st.remove(tmp);
        }
    }
    return ans;
    }
}