# Maximum Sum Combinations
#
[https://www.interviewbit.com/problems/maximum-sum-combinations/](http://)
public class Solution
{
static int mod=(int)(1e9+7);
​
static class Pair implements Comparable<Pair>
{
int x;
int y;
int z;
Pair(int x,int y,int z)
{
this.x=x;
this.y=y;
this.z=z;
}
public int compareTo(Pair o)
{
return this.x-o.x;
}
}
public static void reverse(int[] a)
{
int low=0;
int high=a.length-1;
while(low<high)
{
int swap=a[low];
a[low]=a[high];
a[high]=swap;
low++;
high--;
}
}
public static int[] solve(int[] a, int[] b, int c) {