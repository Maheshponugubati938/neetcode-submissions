class Solution {
    public int maxArea(int[] heights) {
        int maxi = 0;
        int left = 0;
        int right = heights.length-1;
        while(left <= right){
            int mini = Math.min(heights[left],heights[right]);
            int calc = mini * (right - left);

            maxi = Math.max(maxi,calc);
            if(mini == heights[left]){
                left++;
            }else if(mini == heights[right]){
                right--;
            }

        }
        return maxi;
    }
}
