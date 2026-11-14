class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        if(intervals.length <= 1){

            return intervals;
        }
        int write = 0;

        for(int i = 0; i<intervals.length; i++){

            if(intervals[i][0]<= intervals [write][1]){
                intervals[write][1]= Math.max(intervals[i][1],intervals [write][1]);
            }
            else{

                write++;
                intervals[write] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals,write+1);
    }
}
