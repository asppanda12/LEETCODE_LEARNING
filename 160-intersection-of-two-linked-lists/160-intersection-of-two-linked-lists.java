/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
   
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int max1=0;
        int max2=0;
        ListNode head1=headA;
        ListNode head2=headB;
        int cnta=0;
        while(head1!=null)
        {
            cnta++;
            head1=head1.next;
        }
        int cntb=0;
        while(head2!=null)
        {
            cntb++;
            head2=head2.next;
        }
        ListNode max=null;
        ListNode min=null;
        int max12=Math.max(cntb,cnta);
        int min12=Math.min(cntb,cnta);
        if(cntb>cnta)
        {
            max=headB;
            min=headA;
        }
        else
        {
            max=headA;
            min=headB;
        }
        int rem=max12-min12;
        while(rem>0)
        {
            max=max.next;
            rem=rem-1;
        }
      
        while(max!=null && min!=null)
        {
            if(max==min)
            {
                return max;
            }
            max=max.next;
            min=min.next;
        }
        return null;
        
    }
}