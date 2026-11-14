class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] mergedList = new int[intervals.length+1][2];
        int p = 0;
        for(int[] interval : intervals){
            mergedList[p]= interval;
            p++;
        }
        mergedList[mergedList.length-1]= newInterval;

        Arrays.sort(mergedList, Comparator.comparingInt(m -> m[0]));
        int write = 0;
        for( int i = 1; i<mergedList.length; i++){
            if(mergedList[i][0]<= mergedList[write][1]){
                mergedList[write][1] = Math.max(mergedList[write][1],mergedList[i][1]);
            }
            else{

                write++;
                mergedList[write] = mergedList[i];
            }
        }

        return Arrays.copyOf(mergedList , write+1);
    }
}
