class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int maxCapacity = 0;

        while(left <right){

            int maxHeight = Math.min(heights[left], heights[right]);
            int currentCapacity = maxHeight * (right - left);

            maxCapacity = Math.max(maxCapacity,currentCapacity);

            if(heights[left] > heights[right]){
                right--;
            }
            else{
                left++;
            }

        }

        return maxCapacity;
    }
}
