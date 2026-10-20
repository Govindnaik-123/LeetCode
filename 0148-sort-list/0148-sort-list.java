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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int a[]=new int[arr.size()];
        int k=0;
        for(int i:arr){
            a[k++]=i;
        }
        Arrays.sort(a);
        int i=0;
        ListNode temp1=head;
        while(temp1!=null && i<a.length){
            temp1.val=a[i];
            temp1=temp1.next;
            i++;
        }
        return head;
    }
}