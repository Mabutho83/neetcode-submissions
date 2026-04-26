//intuition:
/*
- check if the length is == 1
- iterate over the array, sort each string within the array
- each individual string serves as a key in a hash table 
- we count the occurences of each string 


*/

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map<string, vector<string>> dict; 
        vector<vector<string>>output;

        for(auto& s: strs){
            string temp = s; 
            sort(temp.begin(), temp.end()); 
            dict[temp].push_back(s); 
        } 

        for(auto& pair: dict){
            output.push_back(pair.second); 
        }
        
        return output; 
    }
};
