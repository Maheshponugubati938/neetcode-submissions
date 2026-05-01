class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        int maxi = Integer.MIN_VALUE;
        if(nums.length == 0){
            return 0;
        }
        for(int val : nums){
            set.add(val);
        }
        
        int count = 0;
        for(int val : set){
            int num = val;
            if(!set.contains(num-1)){
                
                while(set.contains(num+1)){
                    count++;
                    num++;
                    maxi = Math.max(maxi,count);
                }
                count = 0;
            }
        }
        if(maxi == Integer.MIN_VALUE){
            return 1;
        }
        return maxi+1;
    }
}
