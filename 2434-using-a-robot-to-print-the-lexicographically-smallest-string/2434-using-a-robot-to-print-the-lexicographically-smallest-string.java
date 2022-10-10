class Solution 
{
    public String robotWithString(String s) 
    {
        int n=s.length();
        int ch[]=new int[n];
        int min=n-1;
        ch[n-1]=n-1;
        for(int i=n-2;i>=0;i--)
        {
            if(s.charAt(i)<=s.charAt(min))
            {
                min=i;
            }
            ch[i]=min;
        }
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack<Integer>();
        st.add(0);
        for(int i=1;i<n;i++)
        {
            if(st.isEmpty()==false && ch[st.peek()]<i && s.charAt(st.peek())<=s.charAt(ch[i]))
            {
            while(st.isEmpty()==false && ch[st.peek()]<i && s.charAt(st.peek())<=s.charAt(ch[i]))
            {
                sb.append(s.charAt(st.peek()));
                st.pop();
            }
                st.add(i);
            }
            else
           if(st.isEmpty()==false && ch[st.peek()]==i && s.charAt(st.peek())==s.charAt(i))
            {
          
                sb.append(s.charAt(i));
            }
            
            else
            {
                st.add(i);
            }
        }
        while(st.isEmpty()==false)
        {
            sb.append(s.charAt(st.pop()));
        }
        
        return sb.toString();        
    }
}