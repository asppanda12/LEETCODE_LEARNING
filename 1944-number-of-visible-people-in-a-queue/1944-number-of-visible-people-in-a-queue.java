class Solution 
{
    public int[] canSeePersonsCount(int[] heights) 
    {
        int n=heights.length;
        int[] forw=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        st.add(heights[n-1]);
        forw[0]=0;
        for(int j=n-2;j>=0;j--)
        {
            int cnt=0;
            while(st.isEmpty()==false && heights[j]>st.peek())
            {
                st.pop();
                cnt++;
            }
            if(st.isEmpty()==false)
            {
                cnt=cnt+1;
            }
            forw[j]=cnt;
            st.add(heights[j]);
        }
        return forw;
        
    }
}