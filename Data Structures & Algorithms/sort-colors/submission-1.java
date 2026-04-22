class Solution {
    public void sortColors(int[] nums) {
        // int zero = 0;
        // int one = 0;
        // int two = 0;
        
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == 0){
        //         zero++;
        //     }else if(nums[i] == 1){
        //         one++;
        //     }else{
        //         two++;
        //     }
        // }

        // for(int i = 0; i < zero; i++){
        //     nums[i] = 0;
        // }

        // for(int i = zero; i < one + zero; i++){
        //     nums[i] = 1;
        // }

        // for(int i = one + zero; i < nums.length; i++){
        //     nums[i] = 2;
        // }

        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int swap = nums[mid];
                nums[mid] = nums[high];
                nums[high] = swap;
                high--;
            }
        }
    }
}