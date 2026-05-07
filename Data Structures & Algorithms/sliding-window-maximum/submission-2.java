class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque <Integer> dq = new ArrayDeque<>();
        int [] ans = new int[nums.length+1-k];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){

            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]){
                dq.pollLast();
            }

            dq.offer(i);

            if(i >= k-1){
                ans[idx++] = nums[dq.peekFirst()];
            }
        }
        return ans;

    }
}
