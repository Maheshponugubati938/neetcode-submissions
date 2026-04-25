class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int prefix[] = new int[nums.length];
        int [] suffix = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            prefix[i] = mul;
            mul = mul * nums[i];
        }

        int sufMul = 1;
        for(int i = nums.length-1; i >= 0; i--){
            suffix[i] = sufMul;
            sufMul = sufMul * nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = prefix[i] * suffix[i];
        }
        return nums;
    }
}  
