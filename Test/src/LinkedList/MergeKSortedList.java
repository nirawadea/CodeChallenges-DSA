package LinkedList;

import java.util.PriorityQueue;

public class MergeKSortedList {
    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Solution class containing mergeKLists
    public static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode head = new ListNode(0);
            ListNode ptr = head;

            PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
            for (ListNode listnode : lists) {
                if (listnode != null) {
                    pq.offer(listnode);
                }
            }

            while (!pq.isEmpty()) {
                ptr.next = pq.poll();
                ptr = ptr.next;
                if (ptr.next != null) {
                    pq.offer(ptr.next);
                }
            }
            return head.next;
        }
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test mergeKLists
    public static void main(String[] args) {
        // Creating the input: [[1,4,5], [1,3,4], [2,6]]
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));

        Solution solution = new Solution();
        ListNode merged = solution.mergeKLists(lists);

        System.out.print("Merged List: ");
        printList(merged);  // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
    }
}
