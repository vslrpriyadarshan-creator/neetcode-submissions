class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer,Integer> seenMap = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){

            int remainder = target - nums[i];
            if(seenMap.containsKey(remainder)){
                return new int [] {seenMap.get(remainder),i};
            }
            seenMap.put(nums[i],i);
        }

        return new int []{-1,-1};
        
    }
}
