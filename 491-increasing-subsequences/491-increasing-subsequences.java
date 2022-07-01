class Solution {
    public List<List<Integer>> findSubsequences(int[] nums)
    {
        int n=nums.length;
        HashSet<List<Integer>> ap=new HashSet<List<Integer>>();
        for(int i=0;i<1<<n;i++)
        {
            int max=Integer.MIN_VALUE;boolean flag=false;int one=0;
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    if(nums[j]>=max)
                    {
                        max=nums[j];
                        one++;
                    }
                    else
                    {
                        flag=true;
                        break;
                    }
                }
            }
            List<Integer> arr=new ArrayList<Integer>();
            if(flag==false && one>=2)
            {
                  for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    arr.add(nums[j]);
                }
            }
                ap.add(arr);
            }
        }
         List<List<Integer>> ao=new ArrayList<List<Integer>>();
        for(List<Integer> ans:ap)
        {
            
            ao.add(ans);
        }
        return ao;
    }
}