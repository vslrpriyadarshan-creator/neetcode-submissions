class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> sumMap = new HashMap<> ();
        sumMap.put(0,1);
        int currentPrefixSum = 0;
        int requiredPrefixSum = 0;
        int subArrayCountSumsToK = 0;
        int prefixSumCount = 0;
        for( int i = 0 ; i<nums.length ; i++){

            currentPrefixSum = currentPrefixSum+nums[i];
            requiredPrefixSum = currentPrefixSum - k;

            if(sumMap.containsKey(requiredPrefixSum)){

                subArrayCountSumsToK = subArrayCountSumsToK + sumMap.get(requiredPrefixSum);

            }

            sumMap.merge(currentPrefixSum , 1 , (oldValue , newValue) -> oldValue + newValue);

        }

        return subArrayCountSumsToK;
    }
}