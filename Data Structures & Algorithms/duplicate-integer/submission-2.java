class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set <Integer> seenValues = new HashSet <> ();

        for (int i = 0 ;i<nums.length; i++){
            if(seenValues.contains(nums[i])){
                return true;
            }
            seenValues.add(nums[i]);
        }

        return false;
    }
}