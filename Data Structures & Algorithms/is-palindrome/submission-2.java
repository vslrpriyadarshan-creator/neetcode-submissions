class Solution {
    public boolean isPalindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z10-9]","");
         int i = 0;
         int j = str.length()-1;

         System.out.print(str);

         while(i < j){

            if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)){

                return false;
            }
            i++;
            j--;
         }
        return true;
    }
}
