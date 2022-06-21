// { Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str)
    {
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
  
	public static void main (String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int t=Integer.parseInt(br.readLine());
            
            while(t > 0){
                String s = br.readLine();
                Node root = buildTree(s);
                
                int k=Integer.parseInt(br.readLine());
                
                Solution g = new Solution();
                System.out.println (g.kthLargest(root,k));
                t--;
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public static int count_no(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=count_no(root.left);
        int right=count_no(root.right);
        return left+right+1;
    }
    public int kthLargest(Node root,int k)
    {
          int no=0;
       Node cur=root;
       int t=count_no(root);
       k=t-k+1;
        while(cur!=null)
        {
           
            if(cur.left==null)
            {
                no++;
                if(no==k)
                {
                    return cur.data; 
                }
                cur=cur.right;
            }
            else
            {
                Node pre=cur.left;
                while(pre.right!=null &&  pre.right!=cur)
                {
                    pre=pre.right;
                }
                if(pre.right==null)
                {
                    pre.right=cur;
             
                    cur=cur.left;
                }
                else
                {
                    pre.right=null;
                    no++;
                              if(no==k)
                {
                    return cur.data; 
                }

                    cur=cur.right;
                }
            }
        }
        return -1;
    }
}