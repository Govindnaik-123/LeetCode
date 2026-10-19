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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
        ListNode prev=head;
        ListNode curr=head;
        int c=0;
        while(prev!=null){
            c++;
            prev=prev.next;
        }
        int m=c/2;
        for(int i=0;i<m;i++){
            temp=curr;
            curr=curr.next;
        }
        temp.next=curr.next;
        return dummy.next;
    }
}