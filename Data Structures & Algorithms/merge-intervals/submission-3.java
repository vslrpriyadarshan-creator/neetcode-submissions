class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1){

            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));

        int write = 0;
        for( int i = 1; i< intervals.length; i++){
            if(intervals[i][0] <= intervals[write][1]){

                intervals[write][1]= Math.max(intervals[i][1],intervals[write][1]);
            }
            else{

                write++;
                intervals[write] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals,++write);
    }
}
