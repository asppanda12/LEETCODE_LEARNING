class Solution
{
    public static int val(int i,int v[],int n,int digit)
    {
        if(i==n)
        {
            for(int j=0;j<=9;j++)
            {
                if(v[j]>1)
                {
                    return 1;
                }
            }
            return 0;
        }
        int total=0;
        if(i==0)
        {
        for(int j=1;j<=9;j++)
        {
            v[j]++;
           total+=val(i+1,v,n,j);
            v[j]--;
        }
        }
        else
        {
        for(int j=0;j<=9;j++)
        {
            v[j]++;
           total+=val(i+1,v,n,j);
            v[j]--;
        }
        }
        return total;
    }
    public int countNumbersWithUniqueDigits(int n) 
    {
        int v[]=new int[10];
        int total=0;
        for(int i=2;i<=n;i++)
        {
         total+=val(0,v,i,0);
        }
         int t_val=(int)Math.pow(10,n);
        return t_val-total;
    }
}