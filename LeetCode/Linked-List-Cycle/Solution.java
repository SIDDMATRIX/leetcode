1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12class Solution {
13    public boolean hasCycle(ListNode head) {
14
15        if (head == null) return false;
16
17        ListNode tortoise = head;
18        ListNode hare = head;
19
20        while (hare != null && hare.next != null) {
21
22            tortoise = tortoise.next;      // move 1 step
23            hare = hare.next.next;        // move 2 steps
24
25            if (tortoise == hare) {
26                return true;
27            }
28        }
29
30        return false;
31    }
32}
33