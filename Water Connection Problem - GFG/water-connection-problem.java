// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            ArrayList<Integer> d = new ArrayList<Integer>();
            
            for(int i=0;i<p;i++)
            {
                a.add(sc.nextInt());
                b.add(sc.nextInt());
                d.add(sc.nextInt());
            }
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.solve(n, p, a, b, d); 
            System.out.println(ans.size());
            for (int i=0;i<ans.size();i++){ 
                System.out.println(ans.get(i).get(0)+" "+ans.get(i).get(1)+" "+ans.get(i).get(2)); 
            }
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    static class Pair
    {
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
            
        }
    }
    static int dst;
    static int s;
    static int min;
    public static void dfs(ArrayList<ArrayList<Pair>> adj,int src,int v[])
    {
        // System.out.println(src);
        if(adj.get(src).size()==0)
        {
            s=src;
            // System.out.println(s);
            return;
        }
        v[src]=1;
        for(Pair ap:adj.get(src))
        {
           
            if(v[ap.x]==0)
            {
                min=Math.min(ap.y,min);
                dfs(adj,ap.x,v);
            }
            
        }
    }
    ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) 
    { 
        int ind[]=new int[n+1];
        int out[]=new int[n+1];
        ArrayList<ArrayList<Pair>> adj=new ArrayList<ArrayList<Pair>>();
        ArrayList<ArrayList<Integer>> res=new  ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<p;i++)
        {
            int u=a.get(i);
            int v=b.get(i);
            int w=d.get(i);
            adj.get(u).add(new Pair(v,w));
            ind[v]++;
            out[u]++;
        }
        // for(int i=1;i<=n;i++)
        // {   
        //   for(Pair apt:adj.get(i))
        //     System.out.print("("+apt.x+","+apt.y+")->");
        //     System.out.println("");

        // }
    
          int v[]=new int[n+1];
         for(int i=1;i<=n;i++)
         {
             ArrayList<Integer> anss=new ArrayList<Integer>();
             if(ind[i]==0 && out[i]==1)
            {
                // System.out.println("hello "+i);
                min=Integer.MAX_VALUE;
                s=i;
                dst=0;
                dfs(adj,i,v);
                anss.add(i);
                anss.add(s);
                anss.add(min); res.add(anss);
             }
            
         }
        
         return res;
     }
} 