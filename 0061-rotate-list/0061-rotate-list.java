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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null){
            return head;
        }
        int count=0;
        ListNode temp1=head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        k=k%count;
        while(k>0){
            ListNode temp2=head;
            ListNode temp3=null;
            while(temp2.next!=null){
                temp3=temp2;
                temp2=temp2.next;
            }
            temp3.next=null;
            temp2.next=head;
            head=temp2;
            k--;
        }
        return head;
    }
}