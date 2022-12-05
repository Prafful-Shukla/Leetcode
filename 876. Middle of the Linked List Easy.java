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
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast !=null && fast.next != null) {
            fast = fast.next.next;//
            slow=slow.next;//slow will always be half of fast
        }
        
        return slow;
    }
}







//       1->2->3->4->5->6-null
//       fs 
//           s  f
//              s     f
//                 s         f[fast is NULL exit loop ]

//        1->2->3->4->5-null
//       fs 
//           s  f
//              s     f      [fast.next is null, exit loop] 
             
