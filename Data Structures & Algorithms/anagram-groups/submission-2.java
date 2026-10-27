class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> groupAnagram = new HashMap<>();

        for(String s : strs){
            int [] frequencyArray = new int [26];

            for(int i = 0; i< s.length(); i++){
                frequencyArray[ s.charAt(i) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for( int value : frequencyArray){
                sb.append('#').append(value);
            }
            String key = sb.toString();

            groupAnagram.computeIfAbsent(key,k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<> (groupAnagram.values());
    }
}
