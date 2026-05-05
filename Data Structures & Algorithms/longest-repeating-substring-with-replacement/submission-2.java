class Solution {
    public int characterReplacement(String s, int k) {
        
        // int ans = 0;
        // for(int i = 0; i < s.length(); i++){
        //         int[] freq = new int[26];
        //     for(int j = i; j < s.length(); j++){

        //         char ch = s.charAt(j);
        //         freq[ch - 'A']++;

        //         int maxFreq = 0;
        //         for(int val : freq){
        //             maxFreq = Math.max(val,maxFreq);
        //         }

        //         int length = j+1 - i;

        //         if(length - maxFreq <= k){
        //             ans = Math.max(length,ans);
        //         }
        //     }
        // }
        // return ans;


        // int ans = 0;
        // for(int i = 0; i < s.length(); i++){
        //     Map <Character,Integer> map = new HashMap<>();

        //     for(int j = i; j < s.length(); j++){

        //         map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

        //         int maxFreq = 0;
        //         for(char val : map.keySet()){
        //             maxFreq = Math.max(maxFreq,map.get(val));
        //         }
        //         int length = j+1 - i;
        //         if(length - maxFreq <= k){
        //             ans = Math.max(ans,length);
        //         }
        //     }
        // }
        // return ans;




        Map <Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxiLength = 0;
        int maxFreq = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            maxFreq = Math.max(maxFreq,map.get(ch));

            int length = i+1 - left;
            if(length - maxFreq <= k){
                maxiLength = Math.max(maxiLength, length);
            }else{
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
                
            }

        }
       return maxiLength;
    }
}
