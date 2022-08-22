class Solution 
{
    static List<List<Integer>> arr;
    public void ans(int[] nums,int i,int n,List<Integer> ls)
    {
        if(i==n)
        {
            arr.add(new ArrayList<Integer>(ls));
            return;
        }
        List<Integer> arr=new ArrayList<Integer>(ls);
        arr.add(nums[i]);
        ans(nums,i+1,n,arr);
        List<Integer> arr1=new ArrayList<Integer>(ls);
        ans(nums,i+1,n,arr1);
    }
    public List<List<Integer>> subsets(int[] nums)
    {
        arr=new ArrayList<>();
        List<Integer> arr1=new ArrayList<Integer>();
        ans(nums,0,nums.length,arr1);
        return arr;
    }
}