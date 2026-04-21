class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character, Integer> mp1 = new HashMap<>();
        Map <Character, Integer> mp2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            mp1.put(ch, mp1.getOrDefault(ch,0)+1);
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            mp2.put(ch, mp2.getOrDefault(ch,0)+1);
        }
        if(mp1.equals(mp2)){
            return true;
        }
        return false;
    }
}
