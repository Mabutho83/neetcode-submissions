class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        Set<Integer> v_nums = new HashSet<>(); 
        for(int num : nums){
            if(!v_nums.add(num))return true;
        }
        return false;
    }
}