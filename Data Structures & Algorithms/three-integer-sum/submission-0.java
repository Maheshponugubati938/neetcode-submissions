class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0) break;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int first = nums[i];
            int second = i+1;
            int third = nums.length-1;

            while(second < third){

                int sum = first + nums[second] + nums[third];

                if(sum == 0){
                    list.add(Arrays.asList(first,nums[second],nums[third]));
                    second++;
                    third--;

                    while(second < third && nums[second] == nums[second-1]){
                        second++;
                    }

                    while(second < third && nums[third] == nums[third+1]){
                        third--;
                    }
                }else if(sum > 0){
                    third--;
                }else{
                    second++;
                }
            }
            

            
        }
        return list;
    }
}
