class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nonDuplicateSet = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(nonDuplicateSet.contains(nums[i])){
                return true;
            }
            nonDuplicateSet.add(nums[i]);
        }
        return false;
    }
}