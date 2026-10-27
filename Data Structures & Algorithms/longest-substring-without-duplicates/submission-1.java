class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        int i = 0;
        int [] frequency = new int [128];
        int longestStringLength = 0;

        while(j< s.length()){

            int asciiValue = s.charAt(j);

                while(frequency[asciiValue] > 0){
                    frequency[s.charAt(i)]--;
                    i++;
                }
                
                frequency[asciiValue]++;
                j++;

                longestStringLength = Math.max(j-i,longestStringLength);
            }

        return longestStringLength;
    }    
}
