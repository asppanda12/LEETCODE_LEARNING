class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int n=cardPoints.length;
        int find=n-k;
        int total_sum=0;
        for(int i=0;i<n;i++)
        {
            total_sum+=cardPoints[i];
        }
        
        int sum=0;
        for(int i=0;i<find;i++)
        {
            sum+=cardPoints[i];
        }
        int min_sum=sum;
        for(int j=find;j<n;j++)
        {
            min_sum=Math.min(min_sum,sum-cardPoints[j-find]+cardPoints[j]);
            sum=sum-cardPoints[j-find]+cardPoints[j];
        }
        return total_sum-min_sum;
        
    }
}