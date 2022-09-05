/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution 
{
    
    public List<List<Integer>> levelOrder(Node root)
    {
        Queue<Node> qu=new LinkedList<Node>();
        
        List<List<Integer>> ls=new ArrayList<List<Integer>>();
        if(root==null)
        {
            return ls;
        }
        qu.add(root);
        while(qu.isEmpty()==false)
        {
            int size=qu.size();
            List<Integer> lp=new ArrayList<Integer>();
            for(int i=0;i<size;i++)
            {
                Node q=qu.peek();
                qu.poll();
                lp.add(q.val);
                List<Node> tq=q.children;
                for(int j=0;j<tq.size();j++)
                {
                    if(tq.get(j)!=null)
                    qu.add(tq.get(j));
                }
            }
            ls.add(lp);
        }
        return ls;
    }
}