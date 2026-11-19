class Solution {
    public List<List<Integer>> combine(int n, int k) {

        
        int startFrom = 1;
        int length = n;
        int maxLength = k;

        List<Integer> current = new ArrayList <> ();
        List<List<Integer>> result = new ArrayList<>();

        findAllCombinations(startFrom, length, maxLength, current, result);

        return result;
        
    }

    public void findAllCombinations(int startFrom, int length,int maxLength ,List<Integer> current,List<List<Integer>> result){

        if( current.size() == maxLength){
            result.add(new ArrayList<>(current));
            return ;
        }

        if( current.size() > maxLength){
            return;
        }

        for( int i = startFrom; i<=length; i++){

            current.add(i);

            findAllCombinations( i +1, length,maxLength, current, result);

            current.remove(current.size()-1);

        }
    }
}