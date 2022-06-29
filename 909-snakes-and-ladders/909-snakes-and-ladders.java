class Solution 
{
    class Pair
    {
        int x;int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public Pair conv(int val,int n)
    {
       int i=(val%n==0)?val/n-1:val/n;
       int x=n-1-i;
       int j=val%n==0?n-1:val%n-1;
       if((i+1)%2==0)
       j=n-1-j;
       Pair a=new Pair(x,j);
        return a;
    }
    public int snakesAndLadders(int[][] board) 
    {
        Queue<Pair> qu=new LinkedList<Pair>();
        int n=board.length;
        int v[]=new int[n*n+10];
        qu.add(new Pair(1,0));
        v[1]=1;
                HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        int dist=0;
        while(qu.isEmpty()==false)
        {
            int t=qu.peek().x;
            dist=qu.peek().y;
            qu.poll();
            if(t==n*n)
            {
               return dist;
            }
             for(int i=t+1;i<=Math.min(n*n,t+6);i++)
            {
                if(v[i]==0)
                {
                   
                    v[i]=1;
                    Pair tp=conv(i,n);
                    int x=tp.x;
                    int y=tp.y;
                   if(i==n*n)
                    {
                        // System.out.println(map+" "+dist);
                        return dist+1;
                    }
                    if(board[x][y]==-1)
                    {
                        qu.add(new Pair(i,dist+1));
                         map.put(i,t);
                    }
                    else
                    {
                         qu.add(new Pair(board[x][y],dist+1));
                         if(board[x][y]==n*n)
                    {
                        // System.out.println(map+" "+dist);
                        return dist+1;
                    }
                        // v[board[x][y]]=1;
                         map.put(board[x][y],t);
                    }
                }
            }
           
        
        }
            
        return -1;
        
    }
}