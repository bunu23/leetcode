class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int voteCount = 0;

        for (int num : nums) {
            if (voteCount == 0) {
                majorityElement = num;
            }
            if (num == majorityElement) {
                voteCount++;
            } else {
                voteCount--;
            }
        }
        return majorityElement;
    }

}