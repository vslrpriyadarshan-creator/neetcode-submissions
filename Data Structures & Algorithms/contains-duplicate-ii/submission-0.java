class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map <Integer,Integer> seenSet = new TreeMap<> ();

        for(int i = 0; i<nums.length; i++){

            if(seenSet.containsKey(nums[i])){

                if(Math.abs(i - seenSet.get(nums[i])) <= k){

                    return true;
                }
            }

            seenSet.put(nums[i],i);
        }
        

        return false;
    }
}