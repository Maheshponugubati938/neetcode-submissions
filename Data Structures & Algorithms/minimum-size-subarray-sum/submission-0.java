class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i = 0; i < nums.length; i++){

            sum += nums[i];
            while(sum >= target){
                minLen = Math.min(minLen, i+1-left);
                sum = sum - nums[left];
                left++;
            }

            
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}