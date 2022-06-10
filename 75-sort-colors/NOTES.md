class Solution
{
public void sortColors(int[] nums)
{
int n=nums.length;
int z=0;int t=n-1;int ind=0;
while(ind<n&& z<t && ind<=t)
{
if(nums[ind]==0 )
{
int swap=nums[z];
nums[z]=nums[ind];
nums[ind]=swap;
z++;
ind++;
}
else
if(nums[ind]==2)
{
int swap=nums[t];
nums[t]=nums[ind];
nums[ind]=swap;
t--;
}
else
{
ind++;
}
}
}
}