class Solution {
    public int getNext(int n)
    {
         int total_sum=0;
         while(n!=0)
            {
                int rem=n%10;
                total_sum+=rem*rem;
                n=n/10;
            }
        return total_sum;
    }
    public boolean isHappy(int n) 
    {
        HashSet<Integer> set=new HashSet<Integer>();
        while(n!=1 && set.contains(n)==false)
        {
            set.add(n);
            n=getNext(n);
        }
        return n==1;
        
    }
}