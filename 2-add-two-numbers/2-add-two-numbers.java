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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        
      
        ListNode kapa=new ListNode(0);
          ListNode a=kapa;
        int sum=0;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            sum=l1.val+l2.val+carry;
            l1=l1.next;
            l2=l2.next;
            ListNode b=new ListNode(sum%10);
            a.next=b;
            a=a.next;
            carry=sum/10;
        }
        while(l1!=null)
        {
          sum=l1.val+carry;
          l1=l1.next;
          ListNode b=new ListNode(sum%10); 
          a.next=b;
            a=a.next;
          carry=sum/10;
        }
        while(l2!=null)
        {
          sum=l2.val+carry;
          l2=l2.next;
          ListNode b=new ListNode(sum%10); 
          a.next=b;
            a=a.next;
          carry=sum/10;
        }
        if(carry==1)
        {
                      ListNode b=new ListNode(1); 
             a.next=b;
            a=a.next;
        }
        return kapa.next;
    }
}