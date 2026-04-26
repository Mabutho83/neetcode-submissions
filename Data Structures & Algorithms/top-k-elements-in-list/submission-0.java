class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }
        //now to sort the hashmap will be tricky
        // Sort entries by frequency descending, take top k keys
        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue()) // sort by freq desc
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    /*
    -> create a hashmap using unique elements of the array as keys (this
    isn't as easy because how do you store them as unique keys ? without
    using a hashset or somethin?)
    -> then iterate over original array, counting the freq and storing
    -> as values to the key (1 : freq = 2)
    -> then at the end, sort the map and return the top k keys as an array

    * creating and adding keys to the map will be O(1)
    * iterating over the array is O(n) and adding values to the map is O(1)
    * sorting the hashmap will be O(logn) at best lol
    * total solution complexity is O(n) * O(logn)

    * edge cases: 
    - if nums.length == 0 || 1 return []
    - if k <= 0 return []
    //in a hashmap, duplicates naturally merge into the same key...
    */ 
    }
}
