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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=new ListNode(0);
        ListNode temp=head;
        int n1=0;
        while(temp1!=null || temp2!=null || n1!=0){
            int a=(temp1!=null)?temp1.val:0;
            int b=(temp2!=null)?temp2.val:0;
          int  n=a+b+n1;
          if(n>9){
            temp.next=new ListNode(n%10);
        n1=n/10;
          }else{
            temp.next=new ListNode(n);
            n1=0;
          }
          temp=temp.next;
          if(temp1!=null){
            temp1=temp1.next;
          }
          if(temp2!=null){
            temp2=temp2.next;
          }
        }
        return head.next;

    }
}