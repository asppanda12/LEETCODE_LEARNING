class Solution 
{
     public static boolean cycle(ArrayList<ArrayList<Integer>> arr,int src,int parent,int v[],int sv[])
    {
        v[src]=1;
        sv[src]=1;
         boolean flag=false;
        for(Integer val:arr.get(src))
        {
            if(v[val]==0)
            {
                flag|=cycle(arr,val,src,v,sv);
            }
            else
            if(v[val]==1)
            {
                if(sv[val]==1)
                {
                    return true;
                }
                else
                {
                    flag|=cycle(arr,val,src,v,sv);
                }
            }
        }
       sv[src]=0; 
         return flag;
     }
    public static void dfs(ArrayList<ArrayList<Integer>> arr,int src,int v[],Stack<Integer> st)
    {
        v[src]=1;
        for(Integer val:arr.get(src))
        {
            if(v[val]==0)
            {
                dfs(arr,val,v,st);
            }
        }
        st.add(src);
    }
    public static void reverse(int arr[])
    {
        int l=0;int h=arr.length-1;
        while(l<h)
        {
            int swap=arr[l];
            arr[l]=arr[h];
            arr[h]=swap;
            l++;
            h--;
        }
    }
       public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++)
        {
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            
            arr.get(u).add(v);
        }
           int v[]=new int[numCourses];
           int sv[]=new int[numCourses];
           boolean flag1=false;
           for(int i=0;i<numCourses;i++)
           {
               if(v[i]==0)
               {
                     flag1|=cycle(arr,i,-1,v,sv);
               }
           }
           int arp[]=new int[0];
           if(flag1==true)
           {
               return arp;
           }
           arp=new int[numCourses];
           Stack<Integer> st=new Stack<Integer>();
           int v1[]=new int[numCourses];
           for(int i=0;i<numCourses;i++)
           {
               if(v1[i]==0)
               {
                   dfs(arr,i,v1,st);
               }
           }
          
           int t=0;
           while(st.isEmpty()==false)
           {
               arp[t++]=st.peek();
               st.pop();
           }
           reverse(arp);
           return arp;
    }
    
}