class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        int ans[] = new int[2];

        for(int i = 0; i < nums.length; i++){
            
            for(int j = 0; j < nums.length; j++){
                int sum = 0;
                if(i != j && nums[i] != nums[j]){
                    sum += nums[i];
                    sum += nums[j];
                    if(sum == target){
                        ans[0] = i+1;
                        ans[1] = j+1;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
