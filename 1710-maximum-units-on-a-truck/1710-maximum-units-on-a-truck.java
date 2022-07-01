class Solution
{
    static class Pair
    {
        int x;int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    static class Compare {

		static void compare(Pair arr[], int n) {
			// Comparator to sort the pair according to second element 
			Arrays.sort(arr, new Comparator<Pair>() {
				@Override
				public int compare(Pair p1, Pair p2) {
					
                           return p1.y-p2.y;
                    
				}
			});
		}

	}
    public int maximumUnits(int[][] boxTypes, int truckSize) 
    {
        int n=boxTypes.length;
        Pair a[]=new Pair[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Pair(boxTypes[i][0],boxTypes[i][1]);
        }
        Compare.compare(a,n);
        
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
         if(a[i].x<=truckSize)
         {
             truckSize-=a[i].x;
             sum=sum+a[i].x*a[i].y;
         }
        else
        {
            sum=sum+truckSize*a[i].y;
            truckSize=0;
        }
            if(truckSize==0)
            {
                break;
            }
        }
        return sum;
    }
}