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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (numSet.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;

    }
}
/*
 * TIME LIMIT EXCEEDED
 * MAY BE DUE TO NESTED LOOP : The isInNum method iterates through the nums
 * array for each node in the linked list. This results in a time complexity of
 * O(n * m), where:
 * n is the number of nodes in the linked list.
 * m is the length of the nums array.
 * class Solution {
 * public ListNode modifiedList(int[] nums, ListNode head) {
 * 
 * 
 * 
 * ListNode dummy=new ListNode(0);
 * dummy.next=head;
 * ListNode current=dummy;
 * while(current.next!=null){
 * if(isInNum(current.next.val,nums)){
 * current.next=current.next.next;
 * }else{
 * current=current.next;
 * }
 * }
 * 
 * return dummy.next;
 * 
 * }
 * public boolean isInNum(int val, int[]nums){
 * for(int n:nums){
 * if(val==n){
 * return true;
 * } }
 * return false;
 * }
 * }
 */