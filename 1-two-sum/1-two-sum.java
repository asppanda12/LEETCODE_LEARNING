   class Solution 
{
   
   static class Pair {

		int x;

		

		int y;

		// Constructor 

		public Pair(int x, int y) {

			this.x = x;

			this.y = y;

		}

	}

	static class Compare {

		static void compare(Pair arr[], int n) {

			// Comparator to sort the pair according to second element 

			Arrays.sort(arr, new Comparator<Pair>() {

				@Override

				public int compare(Pair p1, Pair p2) {

					

				

						return p1.x - p2.x;

					

				}

			});

		}

	}

    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
       Pair[] a=new Pair[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Pair(nums[i],i);
        }
        Compare.compare(a,n);
    
      int val[]=new int[2];
        int low=0;int high=nums.length-1;
        while(low<high )
        {
            if(a[low].x+a[high].x<target)
            {
                low++;
            }
            else
            if(a[low].x+a[high].x>target)
            {
                  high--;
            }
            else
            {
                
                val[0]=a[low].y;
                val[1]=a[high].y;
                break;
            }
        }   
        return val;
        
    }
}