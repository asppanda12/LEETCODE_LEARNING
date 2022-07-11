// { Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
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
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
  
   static class Pair
    {
        int ind;
        Node root1;
        Pair(Node root1,int ind)
        {
            this.ind=ind;
            this.root1=root1;
        }
    }
    public static void traverse(TreeMap<Integer,Integer> map,Node root,TreeMap<Integer,ArrayList<Integer>> map2)
    {
       Queue<Pair> qu=new LinkedList<Pair>();
       qu.add(new Pair(root,0));
        map2.put(0,new ArrayList<Integer>());
                            map2.get(0).add(root.data);
 map.put(0,root.data);
        while(qu.isEmpty()==false)
        {
             int size=qu.size();
            TreeMap<Integer,ArrayList<Integer>> map1=new TreeMap<>();
            for(int i=0;i<size;i++)
            {
                Pair t=qu.peek();
                qu.poll();
                if(t.root1.left!=null)
                {
                    if(map.containsKey(t.ind-1)==false)
                    map.put(t.ind-1,t.root1.left.data);
                    if(map1.containsKey(t.ind-1)==false)
                    {
                        map1.put(t.ind-1,new ArrayList<Integer>());
                    }
                    map1.get(t.ind-1).add(t.root1.left.data);
                    qu.add(new Pair(t.root1.left,t.ind-1));
                }
                if(t.root1.right!=null)
                {
                    if(map.containsKey(t.ind+1)==false)
                    map.put(t.ind+1,t.root1.right.data);
                     if(map1.containsKey(t.ind+1)==false)
                    {
                        map1.put(t.ind+1,new ArrayList<Integer>());
                    }
                    map1.get(t.ind+1).add(t.root1.right.data);
                    qu.add(new Pair(t.root1.right,t.ind+1));
                }
            }
            for(Map.Entry<Integer,ArrayList<Integer>> ma:map1.entrySet())
        {
               if(map2.containsKey(ma.getKey())==false)
               {
                   map2.put(ma.getKey(),new ArrayList<Integer>());
               }
                ArrayList<Integer> ap1=new ArrayList<Integer>(ma.getValue());
                Collections.sort(ap1);
                map2.get(ma.getKey()).addAll(ap1);
        }
            
        }
        
    }


    static ArrayList<Integer> topView(Node root)
    {
       
         TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();     
        TreeMap<Integer,ArrayList<Integer>> map1=new TreeMap<Integer,ArrayList<Integer>>();   
        traverse(map,root,map1);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        // System.out.println(map);
        for(Map.Entry<Integer,Integer> ma:map.entrySet())
        {
               arr.add(ma.getValue());
        }
        return arr;
    }
}