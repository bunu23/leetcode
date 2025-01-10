class Solution {
    public static int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        for (int i = 0, n = columnTitle.length(); i < n; i++) {
            columnNumber = columnNumber * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return columnNumber;
    }
}

/*
 * class Solution {
 * public int titleToNumber(String columnTitle) {
 * int columnNumber = 0;
 * 
 * for (char c : columnTitle.toCharArray()) {
 * 
 * columnNumber = columnNumber * 26 + (c - 64);
 * }
 * 
 * return columnNumber;
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 */
