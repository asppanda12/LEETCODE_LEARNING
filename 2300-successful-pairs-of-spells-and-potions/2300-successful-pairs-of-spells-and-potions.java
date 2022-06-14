class Solution
{
   public int search(int[] potions,long success,int spells)
   {
       int l=0;int h=potions.length;
       while(l<h)
       {
           int mid=(l+h)/2;
           if((long)potions[mid]*spells>=success)
           {
               h=mid;
           }
           else
           {
               l=mid+1;
           }          
       }
    
       return l;
   }

    public int[] successfulPairs(int[] spells, int[] potions, long success) 
    {
        int n=spells.length;
        int m=potions.length;
        int t[]=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            long sp=(long)(success/(double)spells[i]);
    
            int c=search(potions,success,spells[i]);
            t[i]=m-c;
        }
        return t;
        
    }
}