class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length -1;
        int width = heights.length -1;
        int maxWater = 0;

        while( i < j){
            int maxHeight = Math.min(heights[i],heights[j]);
            maxWater = Math.max(maxHeight * width, maxWater);

            if( maxHeight == heights[i]){

                i++;
            }
            else{
                j--;
            }
            width--;
        }

        return maxWater;
    }
}
