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
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode prev=head;
        ListNode curr=prev.next;
        if(curr==null){
            prev=null;
            return prev;
        }
        if(count-n==0 && count!=1){
            head=prev.next;
            return head;
        }
        
        int c=1;
        while(curr!=null && c<(count-n)){
            c++;
            prev=prev.next;
            curr=curr.next;
        }
        
        prev.next=curr.next;
        curr.next=null;
        return head;

    }
}