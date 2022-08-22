class Solution 
{
    public static void check(PriorityQueue<Integer> max,PriorityQueue<Integer> min,int val)
    {
        if(max.isEmpty()==true)
        {
            max.add(val);
        }
    else
        if(val<=max.peek())
        {
            max.add(val);
        }
        else
        if(val>max.peek())
        {
            min.add(val);
        }
        
        if(max.size()>min.size()+1)
        {
            min.add(max.peek());
            max.poll();
        }
        else
        if(max.size()+1<min.size())
        {
            max.add(min.peek());
            min.poll();
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        PriorityQueue<Integer> max=new PriorityQueue<Integer>(Collections.reverseOrder());   
        PriorityQueue<Integer> min=new PriorityQueue<Integer>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++)
        {
            check(max,min,nums1[i]);
        }
        
        for(int i=0;i<m;i++)
        {
            check(max,min,nums2[i]);
        }
    
        if(max.size()==min.size())
        {
            return (max.peek()+min.peek())/2.00;
        }
        else
        if(max.size()>min.size())
        {
            return max.peek();
        }
        else
        {
            return min.peek();
        }
    }
}