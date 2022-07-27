class Solution {
 public int trap(int[] h) 
         {
        	 Stack<Integer> st=new Stack<Integer>();
        	 int n=h.length;
     
        	 int f[]=new int[n];
        	 for(int i=0;i<n;i++)
        	 {
                
        		 while(st.isEmpty()==false && h[st.peek()]<h[i])
        		 {
        			 st.pop();
        		 }
        		 if(st.isEmpty()==true)
        		 {
        			 f[i]=-1;
        		 }
        		 else
        		 {
        			 f[i]=st.peek();
        		 }
        		 st.add(i);
        	 }
      System.out.println(st);
     System.out.println(Arrays.toString(f));
        	st=new Stack<Integer>();
        	 int b[]=new int[n];
        	 for(int i=n-1;i>=0;i--)
        	 {
        		 while(st.isEmpty()==false && h[st.peek()]<h[i])
        		 {
        			 st.pop();
        		 }
        		 if(st.isEmpty()==true)
        		 {
        			 b[i]=-1;
        		 }
        		 else
        		 {
        			 b[i]=st.peek();
        		 }
        		 st.add(i);
        	 }
          System.out.println(Arrays.toString(f));
     
          System.out.println(Arrays.toString(b));
        	 int val[]=new int[n];
        	 for(int i=0;i<n;i++)
             {
                 if(b[i]>-1)
                 {
                     if(b[i]-i>1)
                     {
                         int min=h[i];
                        int t=b[i];
                     while(i<t)
                     {
                         val[i]=min-h[i];
                         i++;
                     }
                          i=i-1;
                     }
                 }
             }
         for(int i=n-1;i>=0;i--)
             {
                 if(f[i]>-1)
                 {
                     if(i-f[i]>1)
                     {
                         int min=h[i];
                        int t=f[i];
                     while(i>t)
                     {
                         val[i]=Math.max(val[i],min-h[i]);
                         i--;
                     }
                          i=i+1;
                     }
                 }
             }
               System.out.println(Arrays.toString(val));

        	 long sum=0;
        	 for(int i=0;i<n;i++)
        	 {
        		 sum=sum+val[i];
        	 }
        	 return (int)sum;
        	 
         }
}