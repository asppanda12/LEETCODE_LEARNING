see consider all the sum till as sum if u - target= some part of subarray
if this that subarray value is present in the map;
​
suppose u need 5
0 1  2  3  4  5 6  7
val                        3  9 -2 4 1 -7 2 6
sum                 0    3  12 10 14 15 8 14
*         *
what is  15-5 =10 so 10 is present in the map
and 8-5= 3 so it is also present in the map
​
you can get 5 by adding all values in subarrays from (0-5) minus (0-2) =5 so
​
​
​
here is my code
​
​
​
```
class Solution {
public int subarraySum(int[] nums, int k)
{
long sum=0;
HashMap<Long,Long> map=new HashMap<Long,Long>();
int n=nums.length;
int res=0;
for(int i=0;i<n;i++)
{
map.put(sum,map.getOrDefault(sum,(long)0)+1);
sum+=nums[i];
if(map.containsKey(sum-k))
{
res+=map.get(sum-k);
}
}
return res;
}
}
```
**pls upvote **