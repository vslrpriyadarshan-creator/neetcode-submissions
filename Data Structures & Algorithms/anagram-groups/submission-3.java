class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>>groupMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){

            int [] charFrequency = new int[26];
        

            for(int j = 0; j < strs[i].length(); j++){
                charFrequency[strs[i].charAt(j) - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int val : charFrequency){
                key.append('#').append(val);
            }
            
            groupMap.computeIfAbsent(key.toString(), k -> new ArrayList() ).add(strs[i]);
        }
        return new ArrayList (groupMap.values());
    }
}
