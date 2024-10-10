// Stack - O(n)
class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int maxWidth = 0;

        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }

        return maxWidth;

    }
}
/*
 * Brute force (Nested Loop)- time limit exceeded
 * Requires checking all pairs of indices, leading to Big O of n squared
 * class Solution {
 * public int maxWidthRamp(int[] nums) {
 * int maxWidth = 0;
 * int n = nums.length;
 * 
 * 
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * if (nums[i] <= nums[j]) {
 * 
 * maxWidth = Math.max(maxWidth, j - i);
 * }
 * }
 * }
 * 
 * return maxWidth;
 * 
 * }
 * }
 */

/*
 * Optimized Nested Loop (Inner Loop Decrementing j):
 * Iterates through j backwards from the end, breaking early once a valid ramp
 * is found.This can lead to fewer comparisons, though it still has Big O of n
 * squared time complexity in the worst case.
 * 
 * public class Solution{
 * public static int maxWidthRamp(int[] nums) {
 * int maxWidth = 0;
 * int n = nums.length;
 * 
 * 
 * for (int i = 0; i < n; i++) {
 * 
 * for (int j = n - 1; j > i; j--) {
 * if (nums[i] <= nums[j]) {
 * 
 * maxWidth = Math.max(maxWidth, j - i);
 * break; // Found a valid j, no need to check further for this i
 * }
 * }
 * }
 * 
 * return maxWidth;
 * }
 * }
 * 
 * 
 */