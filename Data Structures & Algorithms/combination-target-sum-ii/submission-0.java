class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int start = 0;
        int remainder = target;
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        uniqueSubSet(candidates,start,remainder,current,result);

        return result;
    }

    public void uniqueSubSet(int[] candidates, int start, int remainder, List<Integer> current, List<List<Integer>> result){

        if( remainder == 0){

            result.add(new ArrayList<>(current));
            return;
        }
        if(remainder < 0){

            return;
        }

        

        for( int i = start; i < candidates.length; i++){

            if( i> start && candidates[i] == candidates[i-1]){ continue;}
            
            current.add(candidates[i]);

            uniqueSubSet( candidates, i + 1 , remainder - candidates[i],current,result);

            current.remove(current.size() - 1);
        }
    }
}
