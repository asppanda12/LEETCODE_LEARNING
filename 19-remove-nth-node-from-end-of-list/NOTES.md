​
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
cnt=0;temp=head;ListNode prev=head;
while(cnt<dv)
{
cnt++;
temp=temp.next;
}
cnt=0;
while(cnt<dv-1)
{
cnt++;
prev=prev.next;
}
if(temp.next==null)
{
prev.next=null;
return head;
}
temp.val=temp.next.val;
ListNode temp1=temp.next;
temp.next=temp1.next;
return head;
}
}