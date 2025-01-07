public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}

/*
 * class Solution {
 * public int strStr(String haystack, String needle) {
 * // If needle is an empty string, return 0 (according to problem constraints)
 * if (needle.length() == 0) {
 * return 0;
 * }
 * 
 * // Iterate through the haystack and check for substring match
 * for (int i = 0; i <= haystack.length() - needle.length(); i++) {
 * // Check if the substring of haystack starting at index i matches needle
 * if (haystack.substring(i, i + needle.length()).equals(needle)) {
 * return i; // Found the first occurrence
 * }
 * }
 * 
 * return -1; // No match found
 * }
 * }
 * 
 */