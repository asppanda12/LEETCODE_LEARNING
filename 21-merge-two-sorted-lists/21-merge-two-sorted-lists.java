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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode temp=new ListNode(0);
        ListNode res=temp;
        while(list1!=null && list2!=null)
        {
         
            if(list1.val<list2.val)
            {
                ListNode a=new ListNode(list1.val,null);
                temp.next=a;
                temp=temp.next;
                list1=list1.next;
                
            }
            else
            if(list1.val>=list2.val)
            {
                ListNode a=new ListNode(list2.val,null);
                temp.next=a;
                temp=temp.next;
                list2=list2.next;
            }
        }

        while(list1!=null)
        {
                ListNode a=new ListNode(list1.val,null);
                temp.next=a;
                temp=temp.next;
                list1=list1.next;
        }
          while(list2!=null)
        {
                ListNode a=new ListNode(list2.val,null);
                temp.next=a;
                temp=temp.next;
                list2=list2.next;
        }
        return res.next;
    }
}