class Solution 
{
    public static boolean val(int[] weights,int days,int val)
    {
        int n=weights.length;
        int allo=1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(weights[i]>val)
            {
                return false;
            }
            if(sum+weights[i]>val)
            {
                allo+=1;
                sum=0;
            }
            sum=sum+weights[i];
        }
        if(allo>days)
        {
            return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days)
    {
        int n=weights.length;
        int min=Integer.MAX_VALUE;int sum=0;
        for(int i=0;i<n;i++)
        {
            min=Math.min(weights[i],min);
            sum=sum+weights[i];
        }
        if(n<days)
        {
            return -1;
        }
        int low=min;
        int high=sum;
        int res=0;
        while(low<high)
        {
            int mid=(low+high)>>1;
            if(val(weights,days,mid))
            {
                res=mid;
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    
    }
}