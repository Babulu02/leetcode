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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dum = new ListNode(-1);
        ListNode fast = head;
        ListNode slow = dum; slow.next = fast;
        while(fast != null){
            while(fast.next != null && fast.val == fast.next.val){
                fast = fast.next; 
            }
            if(slow.next != fast){ // duplicate
                slow.next = fast.next; //skip duplicate
                fast = slow.next;
            }else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dum.next;
    }
}