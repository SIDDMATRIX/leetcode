1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3
4        if (head == null || left == right) return head;
5
6        ListNode dummy = new ListNode(0);
7        dummy.next = head;
8
9        ListNode prev = dummy;
10
11        for (int i = 1; i < left; i++) {
12            prev = prev.next;
13        }
14
15        ListNode curr = prev.next;
16
17    
18        for (int i = 0; i < right - left; i++) {
19            ListNode temp = curr.next;
20
21            curr.next = temp.next;
22            temp.next = prev.next;
23            prev.next = temp;
24        }
25
26        return dummy.next;
27    }
28}