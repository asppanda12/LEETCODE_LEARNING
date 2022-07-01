class Solution
{
    public int[] decode(int[] encoded, int first)
    {
        int n=encoded.length;
        int c[]=new int[n+1];
        c[0]=first;
        for(int i=0;i<n;i++)
        {
            c[i+1]=c[i]^encoded[i];
        }
        return c;
        
    }
}