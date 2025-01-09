class Solution {
    public boolean isPalindrome(String s) {

        // initializing two pointer

        int left = 0;
        int right = s.length() - 1;

        // iterating until pointer meet
        while (left < right) {
            System.out.println("Left Pointer: " + left + ", Character: " + s.charAt(left));
            System.out.println("Right Pointer: " + right + ", Character: " + s.charAt(right));

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                System.out.println("Mismatch Found: " + s.charAt(left) + " != " + s.charAt(right));
                return false;
            }

            left++;
            right--;

        }
        return true;

    }
}

/*
 * 
 * SOLUTION to avoid relying on library methods and ensure minimal overhead.
 * 
 * 
 * class Solution {
 * public boolean isPalindrome(String s) {
 * // Initialize pointers
 * int left = 0;
 * int right = s.length() - 1;
 * 
 * // Iterate until pointers meet
 * while (left < right) {
 * // Move left pointer to the next valid character
 * while (left < right && !isAlphaNumeric(s.charAt(left))) {
 * left++;
 * }
 * // Move right pointer to the previous valid character
 * while (left < right && !isAlphaNumeric(s.charAt(right))) {
 * right--;
 * }
 * 
 * // Compare characters in a case-insensitive manner
 * if (toLower(s.charAt(left)) != toLower(s.charAt(right))) {
 * return false;
 * }
 * 
 * // Move pointers inward
 * left++;
 * right--;
 * }
 * 
 * return true; // If all characters matched, it's a palindrome
 * }
 * 
 * // Helper function to check if a character is alphanumeric
 * private boolean isAlphaNumeric(char c) {
 * return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <=
 * '9');
 * }
 * 
 * // Helper function to convert a character to lowercase
 * private char toLower(char c) {
 * if (c >= 'A' && c <= 'Z') {
 * return (char) (c + 32); // Convert uppercase to lowercase
 * }
 * return c; // Return as is if already lowercase or a digit
 * }
 * }
 * 
 */