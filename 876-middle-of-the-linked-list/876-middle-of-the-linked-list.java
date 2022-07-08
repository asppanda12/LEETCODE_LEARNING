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
    public ListNode middleNode(ListNode head) 
    {
        ListNode head1=head;
        int len=0;
        while(head1!=null)
        {
            len++;
            head1=head1.next;
        }
        int i=0;
        head1=head;
        while(i<len/2)
        {
            i++;
            head1=head1.next;
        }
        // if(head1.next==null)
        // {
        //     head1=null;
        // }
        // else
        // {
        //     head1.val=head1.next.val;
        //     head1.next=head1.next.next;
        // }
        return head1;
        
    }
}