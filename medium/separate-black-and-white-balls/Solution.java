class Solution {
    public long minimumSteps(String s) {
        int countZero = 0;
        long swaps = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                countZero++;
            }
        }

        int onesToMove = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {

                swaps += countZero;
                onesToMove++;
            } else {

                countZero--;
            }
        }

        return swaps;
    }
}