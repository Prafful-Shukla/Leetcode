class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        //Store the frequencies of words using HashMap
       Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
            
        }
        //Store the strings in Priority queue in such a way that it stores the
        //Strings from highest to lowest
        //In case if the freqencies are equal then it sort the strings lexicographically
        //So deinfe a comparator class for priorityqueue 
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
         @Override
            public int compare(String word1 , String word2){
                int freqOfword1 = map.get(word1);
                int freqOfword2 = map.get(word2);
                
                if(freqOfword1 == freqOfword2) return word2.compareTo(word1);
                
                return freqOfword1 - freqOfword2;
            }
        });
        //Store the key values(Strings) of map into priority queue until it's size == k
        for(Map.Entry<String,Integer> mp : map.entrySet()){
            
            pq.add(mp.getKey());
            if(pq.size()>k) pq.poll();
            
        }
        
        //Now initialize a list to store the values of the  priority queue
        List<String> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        
        //reverse the list
        Collections.reverse(list);
        
        return list;
    }
}

//Time Complexity is O(nlogk)
//Space Complexity is O(n)
