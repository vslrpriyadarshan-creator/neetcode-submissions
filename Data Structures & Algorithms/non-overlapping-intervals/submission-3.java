class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int previous = Integer.MIN_VALUE;
        int minRemovalForNonOverlapping = 0;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
        for(int i = 0; i<intervals.length;i++){

            if(intervals[i][0] < previous){

                minRemovalForNonOverlapping++;
                
            }
            else{

                previous = intervals[i][1];
            }

        }

        return minRemovalForNonOverlapping;
    }
}
