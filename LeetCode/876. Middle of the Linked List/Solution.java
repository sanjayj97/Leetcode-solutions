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
        if( head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode curr2 = head;
        while(curr2 != null && curr2.next != null){
            curr = curr.next;
            curr2 = curr2.next.next;
        }
        return curr;
    }
}