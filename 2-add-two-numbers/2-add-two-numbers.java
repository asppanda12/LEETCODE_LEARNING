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
        ListNode head=new ListNode(0);
      
                  ListNode aku=head;
    
        int carry=0;
        while(l1!=null && l2!=null)
        {
           int val1=l1.val;
           int val2=l2.val;
           int sum=val1+val2+carry;
            if(carry==1)
            {
                carry=0;
            }
           carry+=sum/10;
           ListNode ap=new ListNode(sum%10);
           aku.next=ap;
           
           aku=aku.next;
            l1=l1.next;
             l2=l2.next;
        }
       
        while(l1!=null)
        {
            int val1=l1.val;
           int sum=val1+0+carry;
            if(carry==1)
            {
                carry=0;
            }
           carry+=sum/10;
           
           ListNode ap=new ListNode(sum%10);
           aku.next=ap;
           aku=aku.next;
                        l1=l1.next;

        }
          while(l2!=null)
        {
            int val2=l2.val;
           int sum=val2+0+carry;
if(carry==1)
            {
                carry=0;
            }
           carry+=sum/10;           ListNode ap=new ListNode(sum%10);
           aku.next=ap;
           aku=aku.next;
                            l2=l2.next;

        }
        if(carry==1)
        {
            ListNode ap=new ListNode(1);
           aku.next=ap;
           
           aku=aku.next;
        }
        return head.next;
        
    }
}