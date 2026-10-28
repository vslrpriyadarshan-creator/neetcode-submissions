class Solution {
    public int lengthOfLongestSubstring(String s) {

        int [] frequency = new int [128];
        int j = 0;
        int longestString = 0;
        for(int i =0 ; i< s.length(); i++){

            while(frequency[s.charAt(i)] > 0){
                frequency[s.charAt(j)]--;
                j++;
            }

            frequency[s.charAt(i)]++;
            longestString = Math.max(longestString, i - j + 1);
        }
        return longestString;
    }
}
