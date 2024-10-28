class Solution {
    public int longestSquareStreak(int[] nums) {

        Arrays.sort(nums);
        HashMap<Integer, Integer> streakMap = new HashMap<>();
        int maxLength = -1;
        for (int num : nums) {
            int previous = (int) Math.sqrt(num);
            if (previous * previous == num && streakMap.containsKey(previous)) {
                streakMap.put(num, streakMap.get(previous) + 1);
            } else {
                streakMap.put(num, 1);
            }

            if (streakMap.get(num) >= 2) {
                maxLength = Math.max(maxLength, streakMap.get(num));
            }
        }
        return maxLength;
    }
}