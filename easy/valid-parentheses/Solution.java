class Solution {
    public boolean isValid(String s) {

        // If the length of the string is odd, it can't be a valid sequence
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check for matching closing brackets
            else {
                // If the stack is empty, it means there’s no matching opening bracket
                if (stack.isEmpty())
                    return false;

                char top = stack.pop(); // Pop the most recent opening bracket
                // Check for the matching pair
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // Return false if there’s a mismatch
                }
            }
        }
        // If the stack is empty, all brackets are properly closed
        return stack.isEmpty();
    }
}

// class Solution {
// public boolean isValid(String s) {
// // If the length of the string is odd, it can't be a valid sequence
// if (s.length() % 2 != 0) return false;

// Stack<Character> stack = new Stack<>();
// for (char c : s.toCharArray()) {
// // If it's an opening bracket, push it to the stack
// if (c == '(' || c == '{' || c == '[') {
// stack.push(c);
// }
// // Check for matching closing brackets
// else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
// stack.pop();
// } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
// stack.pop();
// } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
// stack.pop();
// } else {
// // If there's no match, return false
// return false;
// }
// }
// // If the stack is empty, all brackets have been matched
// return stack.isEmpty();
// }
// }
