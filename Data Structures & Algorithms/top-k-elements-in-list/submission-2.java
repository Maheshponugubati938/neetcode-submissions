class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] =  new int[k];

        TreeMap <Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int idx = 0;
        
        while(k > 0){
            int freq = -1;
            int maxi = -1;
            for(int val : map.keySet()){
                if(map.get(val) > freq){
                    freq = map.get(val);
                    maxi = val;
                }
            }
            ans[idx++] = maxi;
            map.remove(maxi);
            k--;
        }
        return ans;
    }
}
