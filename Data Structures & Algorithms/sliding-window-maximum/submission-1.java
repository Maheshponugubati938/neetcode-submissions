class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int sum = 0;
        // int maxi = Integer.MIN_VALUE;
        int left = 0;
        List <Integer> list = new ArrayList<>();
        List <Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
            if(list.size() == k){
                int maxi = Collections.max(list);
                ans.add(maxi);
                list.remove(0);
                
            }
        }
        int idx = 0;
        int[] arr = new int[ans.size()];
        for(int val : ans){
            arr[idx++] = val;
        }
        return arr;
    }
}
