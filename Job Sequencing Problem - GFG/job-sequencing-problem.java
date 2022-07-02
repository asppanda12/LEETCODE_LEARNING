// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
         Arrays.sort(arr, (a,b)->(a.deadline-b.deadline));
       
         PriorityQueue<Integer> pq=new  PriorityQueue<Integer>();
          pq.add(arr[0].profit);
          for(int i=1;i<n;i++)
          {
              if(arr[i].deadline>pq.size())
              {
                  pq.add(arr[i].profit);
              }
              else
              if(arr[i].profit>pq.peek())
             {
                 pq.peek();
                 pq.add(arr[i].profit);
                 pq.poll();
             }
          }
          int sum=0;
          int t=pq.size();
          while(pq.isEmpty()==false)
          {
              sum=sum+pq.peek();
              pq.poll();
          }
          int k[]={t,sum};
          return k;
        // Your code here
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/