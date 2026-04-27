class Solution {
    public int maxArea(int[] heights) {
        // int maxi = 0;
        // int left = 0;
        // int right = heights.length-1;
        // while(left <= right){
        //     int mini = Math.min(heights[left],heights[right]);
        //     int calc = mini * (right - left);

        //     maxi = Math.max(maxi,calc);
        //     if(mini == heights[left]){
        //         left++;
        //     }else if(mini == heights[right]){
        //         right--;
        //     }

        // }
        // return maxi;


        //brute force
        int maxi = 0;
        for(int i = 0; i < heights.length; i++){

            for(int j = heights.length-1; j >= 0; j--){
                int mini = Math.min(heights[i], heights[j]);
                int calc = mini * (j - i);
                maxi = Math.max(maxi,calc);
                
            }
        }
        return maxi;
    }
}
