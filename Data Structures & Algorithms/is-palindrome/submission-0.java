class Solution {
    public boolean isPalindrome(String s) {

        String cleanText = s.replaceAll("[^a-zA-Z0-9]", "");
        String text = cleanText.toLowerCase();
        char [] charArray = text.toCharArray();
        int i = 0;
        int j = charArray.length - 1 ;
        while( i < j){
            if(charArray[i] != charArray[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
