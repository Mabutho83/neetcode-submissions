class Solution{
    public:
        vector <int> twoSum(vector<int>&nums, int target){
            if(nums.size() < 2){
                return {nums[0]}; 
            }

            for(int i = 0; i < nums.size(); i++){
                for(int k = i + 1; k < nums.size(); k++){
                    if(nums[i] + nums[k] == target){
                        return {i, k}; 
                    }
                }
            }
            return {}; 
        }
};   