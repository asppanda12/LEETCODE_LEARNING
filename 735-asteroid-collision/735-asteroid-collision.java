class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> st=new Stack<Integer>();
        int n=asteroids.length;
        st.add(asteroids[0]);
        for(int i=1;i<n;i++)
        {
         
            while(st.isEmpty()==false && Math.abs(st.peek())<Math.abs(asteroids[i]) &&((st.peek()>0 && asteroids[i]<0)))
            {
                st.pop();
            }
            // System.out.println(st);
            if(st.isEmpty()==false  &&  Math.abs(st.peek())==Math.abs(asteroids[i]) && ((st.peek()>0 && asteroids[i]<0)))
            {
                st.pop();
            }
            else
            if(st.isEmpty()==true ||  (st.peek()*asteroids[i]>0) || st.peek()<asteroids[i])
            {
                st.add(asteroids[i]);
            }
        }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       int ar[]=new int[st.size()];
        int i=0;int siz=st.size();
        while(st.isEmpty()==false)
        {
            ar[siz-i++-1]=st.pop();
        }
        return ar;
    }
}