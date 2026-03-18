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
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){
            return true;
        }
        ListNode mid = findMid(head);
        ListNode prev=null;
        ListNode curr = mid;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode lft = head;
        ListNode rht = prev;
        while(rht != null){
            if(lft.val != rht.val){
                return false;
            }
            lft = lft.next;
            rht = rht.next;
        }
        return true;
    }
    public ListNode findMid(ListNode head){
        ListNode slw = head;
        ListNode fst = head;
        while(fst != null && fst.next != null){
            slw = slw.next;
            fst = fst.next.next;
        }
        return slw;
    }
}