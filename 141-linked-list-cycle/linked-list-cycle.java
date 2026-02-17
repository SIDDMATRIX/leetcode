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
class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {

            tortoise = tortoise.next;      // move 1 step
            hare = hare.next.next;        // move 2 steps

            if (tortoise == hare) {
                return true;
            }
        }

        return false;
    }
}
