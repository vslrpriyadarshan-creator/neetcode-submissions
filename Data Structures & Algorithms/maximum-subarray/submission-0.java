class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int max = nums[0];

        for(int j = 1; j< nums.length ;j++){
            currentMax = Math.max(nums[j], currentMax+nums[j]);
            max = Math.max(currentMax,max);
        }
        return max;
    }
}
