class Solution {
    public int minLength(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
            if (stack.size() >= 2) {
                char second = stack.peek();
                char first = stack.get(stack.size() - 2);
                if ((first == 'A' && second == 'B') || (first == 'C' && second == 'D')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return stack.size();
    }
}