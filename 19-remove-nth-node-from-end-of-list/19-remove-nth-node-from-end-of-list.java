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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         int cnt=0;
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        int dv=cnt-n;
        if(dv==0)
        {
            return head.next;
        }
        cnt=0;temp=head;
        while(cnt<dv-1)
        {
            cnt++;
            temp=temp.next;
        }
       ListNode temp1=temp.next;
        temp.next=temp1.next;
        return head;
    }
}