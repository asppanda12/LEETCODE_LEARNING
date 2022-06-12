class Solution {
public long minimumRemoval(int[] beans)
{
int n=beans.length;
Arrays.sort(beans);
long ans=0;
long sum=0;
for(int i=0;i<n;i++)
{
sum+=beans[i];
}
ans=sum;
for(int i=0;i<n;i++)
{
ans=Math.min(ans,(long)((sum)-(long)beans[i]*(n-i)));
}
return ans;
}
}