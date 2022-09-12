class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        for(int i=0;i<k-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        ListNode next = curr.next;
        curr.next=null;
        ListNode reversed = reverse(head);
        head.next = reverseKGroup(next,k);
        return reversed;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,next=null;
        while(curr!=null){
            next = curr.next;
            if(prev!=null){
                curr.next=prev;
            }
            prev=curr;
            curr=next;
        }
        return prev;
    }
}