class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] =  new int[k];

        Map <Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Map <Integer, List<Integer>> map2 = new HashMap<>();

        int maxi = 0;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            int key = mp.getValue();
            int freq = mp.getKey();

            if(map2.containsKey(key)){
                map2.get(key).add(freq);
            }else{
                List <Integer> li = new ArrayList<>();
                li.add(freq);
                map2.put(key,li);
            }
            maxi = Math.max(maxi,key);
        }
        int[] arr = new int[k];
        int idx = 0;
        while(maxi > 0 && idx < k){
            if(map2.containsKey(maxi)){
                for(int num : map2.get(maxi)){
                    arr[idx++] = num;
                    if(idx == k) break;
                }
            }
            maxi--;
        }
        return arr;
    }
}
