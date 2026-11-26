class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry<Integer, Integer>::getValue));
        Map<Integer,Integer> frequency = new HashMap<>();
        int [] result = new int [k];

        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> distinctFrequency: frequency.entrySet() ){

            pq.offer(distinctFrequency);
            if(pq.size() > k){
                pq.poll();
            }
        }

        for( int i = 0; i < k; i++){
            result[i] = pq.poll().getKey();
        }
        return result;
        
    }
}
