class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer,Integer> positionMap = new HashMap<>();        

        for ( int i = 0; i< nums.length; i++){

            int diff = target - nums[i];

            if(positionMap.containsKey(diff)){

                return new int [] {positionMap.get(diff),i};
            }

            positionMap.put(nums[i],i);

        }

        return new int [0];
        
    }
}
