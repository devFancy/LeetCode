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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode node = null, run = head;

        while(run != null) {
            var temp = run.next;
            run.next = node;
            node = run;
            run = temp;
        }

        return node;
    }
}