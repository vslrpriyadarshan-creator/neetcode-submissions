class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> valueMap = new HashMap<> ();
        valueMap.put(0,1);
        Integer requiredValue = 0;
        int currentValue = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){

            currentValue += nums[i];
            requiredValue = currentValue - k ;

            if(valueMap.containsKey(requiredValue)){
                count += valueMap.get(requiredValue);
            }

            valueMap.merge(currentValue, 1 , (oldValue, newValue)-> oldValue+newValue);
        }

        return count;
    }
}