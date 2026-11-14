class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
        int previous = intervals[0][1];
        int minRemovalForNonOverlapping = 0;

        
        for(int i = 1; i<intervals.length;i++){

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
