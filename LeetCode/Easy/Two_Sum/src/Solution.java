class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j ) {
                    result = new int[]{j,i};
                    break;
                }
            }
        }
        return result;
    }
}