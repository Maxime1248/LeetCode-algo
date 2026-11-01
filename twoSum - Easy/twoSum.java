class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i<nums.length; i++){
                for(int y = 0; y < nums.length; y++){
                    if(nums[i] + nums[y] == target && i != y){
                        int[] resultat = {i, y};
                        return resultat;
                    }
                }
        }
        return null;
    }
}