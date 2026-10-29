class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = findMid( start, end);

        while(start <= end){

            mid = findMid(start,end);

            if(nums [mid] > target){
                end = mid-1;
                
            }
            if(nums [mid] < target){
                start = mid+1;
                
            }
            if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
 
    }

    private int findMid(int start, int end){

        return start+(end-start)/2;


    }
}
