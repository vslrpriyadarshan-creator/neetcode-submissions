class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> orginalSet = new HashSet <> ();
        for(Integer i : nums){
            if (orginalSet.contains(i)){
                return true;
            }
            orginalSet.add(i);
        }
        
        return false;
    }

}