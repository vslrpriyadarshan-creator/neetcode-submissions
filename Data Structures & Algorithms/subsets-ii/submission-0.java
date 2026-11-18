class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        int start = 0;
        List<Integer> current;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        findSubset(nums, start, new ArrayList<>(),result);

        return result;
    }

    public void findSubset(int [] nums, int start, List<Integer> current, List<List<Integer>>result){

        result.add(new ArrayList<>(current));

        for(int i = start; i < nums.length; i++){

            if(i > start && nums[i] == nums[i-1]){
                continue;
            }
            
            current.add(nums[i]);
            findSubset(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}
