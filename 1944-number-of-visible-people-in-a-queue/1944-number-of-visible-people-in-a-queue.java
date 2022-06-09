class Solution {
    public int[] canSeePersonsCount(int[] heights)
    {
        int n=heights.length;
        Stack<Integer> st=new Stack<Integer>();
        int ind[]=new int[n];
        st.add(n-1);
        ind[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            if(heights[i]<=heights[st.peek()])
            {
                 ind[i]=1;
                st.add(i);
            }
            else
            {
                int cnt=0;
                while(st.isEmpty()==false && heights[st.peek()]<heights[i])
                {
                    cnt++;
                    st.pop();
                }
                if(st.isEmpty()==false)
                ind[i]=cnt+1;
                else
                ind[i]=cnt;
                 st.add(i);
            }
        }
       return ind;
    }
}