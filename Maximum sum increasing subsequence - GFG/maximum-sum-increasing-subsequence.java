// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int val(int dp[],int n,int arr[])
    {

        if(n<=0)
        {
            return 0;
        }
        if(n==1)
        {
            return arr[n-1];
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int max=0;
        for(int i=n-1;i>0;i--)
        {
            if(arr[n-1]>arr[i-1])
            {
                max=Math.max(val(dp,i,arr),max);
            }
        }
        return dp[n]=arr[n-1]+max;
    }
	public int maxSumIS(int arr[], int n)  
	{  
	    int dp[]=new int[n+10];
	    Arrays.fill(dp,-1);
	    int max=0;
	   for(int i=n;i>0;i--)
	   {
	       max=Math.max(val(dp,i,arr),max);
	   }
	   return max;
	}  
}