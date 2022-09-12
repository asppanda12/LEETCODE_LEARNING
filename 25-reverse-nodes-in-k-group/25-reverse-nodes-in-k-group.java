/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode reverse(ListNode pre1,ListNode head,ListNode end)
    {
        ListNode pre=head;
        ListNode curr=head.next;
        ListNode next=null;
        while(curr!=end)
        {
            next=curr.next;
            if(pre==head)
            {
                pre.next=pre1;
                curr.next=pre;
            }
            else
            {
                 curr.next=pre;   
            }
            pre=curr;
            curr=next;
        }
        return pre;
    } 
    public ListNode res(ListNode head,int k,ListNode pre)
    {
          ListNode root=head;
        for(int i=1;i<=k-1 &&  root!=null;i++)
        {
            root=root.next;
        }
        if(root==null)
        {
            return head;
        }
        else
        {
            ListNode end=root.next;
            ListNode pre1=reverse(pre,head,end);
            ListNode karp=res(end,k,head);
            head.next=karp;
            return pre1;
        }
    }
     public ListNode reverseKGroup(ListNode head, int k) 
     {

         ListNode r=res(head,k,null);           
         return r;
     }
}