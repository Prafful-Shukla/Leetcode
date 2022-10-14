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
        if(head.next==null)
            return null;
        
        ListNode skip2=head;
        ListNode skip1=head;// for finding middle term
        ListNode prevskip1=null;//for deleting middle term
        
        //for even middle term
        //for odd middle term 
        while(skip2!=null && skip2.next!=null){
            skip2=skip2.next.next;
            prevskip1=skip1;
            skip1=skip1.next;
        }
        prevskip1.next=prevskip1.next.next;
        return head;
    }
}
