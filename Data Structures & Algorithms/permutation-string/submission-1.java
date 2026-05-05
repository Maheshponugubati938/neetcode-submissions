class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map <Character, Integer> map = new HashMap<>();
        Map <Character, Integer> mp2 = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int left = 0;
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);

            while(i+1 - left > s1.length()){
                mp2.put(s2.charAt(left),mp2.get(s2.charAt(left))-1);
                if(mp2.get(s2.charAt(left)) == 0){
                    mp2.remove(s2.charAt(left));
                }
                left++;
            }

            if(i+1 - left == s1.length()){
                if(map.equals(mp2)){
                    return true;
                }
            }
        }
        return false;
    }
}
