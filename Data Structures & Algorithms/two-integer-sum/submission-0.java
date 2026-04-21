class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map <Integer,Integer> mp = new HashMap<>();
        int ans[] = new int[2];

        for(int i = 0; i < nums.length; i++){
            int differ = target - nums[i];
            if(mp.containsKey(differ)){
                int previousEle = mp.get(differ);
                int current = i;
                ans[0] = previousEle;
                ans[1] = current;
                break;
            }else{
                mp.put(nums[i], i);
            }
        } 
        return ans;
    }
}
