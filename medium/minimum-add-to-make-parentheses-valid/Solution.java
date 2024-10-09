class Solution {
    public int minAddToMakeValid(String s) {

        int balance = 0; // keeps track of how many more opening parentheses we have compared to closing
                         // ones as we process the string
        int moves = 0;// counts how many parentheses we need to add to make the string valid

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            if (balance < 0) {
                moves++;
                balance = 0;
            }
        }
        return moves + balance;
    }
}

/*
 * 
 * import java.util.Stack;
 * 
 * public class Solution {
 * public int minAddToMakeValid(String s) {
 * Stack<Character> stack = new Stack<>();
 * int moves = 0;
 * 
 * for (char c : s.toCharArray()) {
 * if (c == '(') {
 * stack.push(c);
 * } else if (c == ')') {
 * if (!stack.isEmpty()) {
 * stack.pop();
 * } else {
 * moves++;
 * }
 * }
 * }
 * 
 * return moves + stack.size(); // Moves for unmatched closing + remaining
 * opening
 * }
 * 
 * public static void main(String[] args) {
 * Solution sol = new Solution();
 * 
 * // Test examples
 * System.out.println(sol.minAddToMakeValid("())")); // Output: 1
 * System.out.println(sol.minAddToMakeValid("(((")); // Output: 3
 * }
 * }
 */