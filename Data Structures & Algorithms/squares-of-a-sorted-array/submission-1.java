class Solution {
    public int[] sortedSquares(int[] nums) {

        int [] result = new int [nums.length];
        int left = 0;
        int right = nums.length-1;
        int currentIndex = nums.length-1;
        while(left <= right){

            if(Math.abs(nums[left])>Math.abs(nums[right])){
                
                result[currentIndex] = nums[left]* nums[left];
                left++;
                currentIndex--;
            }
            else{
                result[currentIndex] = nums[right] * nums[right];
                right--;
                currentIndex--;
            }
        }

        return result ;
    }
}