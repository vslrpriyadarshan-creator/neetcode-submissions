class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>  memoizationMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];

            if(memoizationMap.containsKey(needed)){
                return new int []{memoizationMap.get(needed),i};
            }
            else{
                memoizationMap.put(nums[i],i);
            }
        }

        return new int [] {0,0};
    }
}
