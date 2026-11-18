class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         
         int index = 0;
         List<List<Integer>> result= new ArrayList<>();
         List<Integer> current;

         genrateSubsets(nums,index,new ArrayList<>(),result);
         return result;
    }

    public void genrateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result)   
    {

        if(index == nums.length){
            result.add(new ArrayList(current));
            return;
        }

        current.add(nums[index]);
        genrateSubsets(nums,index + 1, current,result);

        current.remove(current.size() - 1);

        genrateSubsets(nums,index + 1, current,result);
    }
}
