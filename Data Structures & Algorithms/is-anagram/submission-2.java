class Solution {
    public boolean isAnagram(String s, String t) {
        //sorting first will result in a O(logn) solution
        //storing frequency counts of words in a hashmap 
        //for the first word, go through using a loop:
        //for each letter, add it to the map
        //this is done for both words or strings at the same time
        //whenever we've seen the letter, increment the count by 1
        //once we've fully explored both strings O(n), 
        //we can loop through the hashmap, checking if there are values
        //not == 2, then return true or false
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>(); 

        for(int i = 0; i < s.length(); i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), 1); 
            }
            else{
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);   
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), 1); 
            }
            else{
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);   
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(!Objects.equals(map1.get(s.charAt(i)), map2.get(s.charAt(i)))){
                return false;
            }
        }
        return true;
        /*
            {r : 2, a : 2, c : 2, e : 1}
            {c : 2, a : 2, r : 2, e : 1 }
        */

    }
}
