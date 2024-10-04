/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        // 1-2-2-1
        // finding middle of the ll
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2-1

        // reversing second half of linked list
        ListNode previous = null; // previous->null
        ListNode current = slow; // current->slow
        while (current != null) {
            ListNode nextTemp = current.next; // c-2, nexttemp=1 // nexttemp-null
            current.next = previous; // 2-null// 1-2-null
            previous = current; // 2-null //1-2-null
            current = nextTemp; // c-1 // c-null
        }

        // comparing first and second
        ListNode left = head; // 1-2-2-1 //head-1
        ListNode right = previous; // 1-2-null
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }
}