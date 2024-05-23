/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while (head != null && head.next != null) {
            head.next = head.next.next;
            if (head == head.next) return true;
            head = head.next;
        }
        return false;
    }
}
