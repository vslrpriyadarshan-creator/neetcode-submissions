class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int [] result = new int [nums.length];
        Arrays.fill(result,1);

        int current = 1;
        for(int i = 0; i<nums.length; i++){

            
            result [i] = result[i] * current;

            current = nums[i] * current;

        }
        current = 1;
        for(int i = nums.length-1; i>=0 ; i--){

            
            result[i] = result[i] * current;
            current = nums[i] * current;
        }

        return result;
        
    }
}  
