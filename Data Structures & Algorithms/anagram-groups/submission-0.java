class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List <String> li = new ArrayList<>();
                li.add(str);
                map.put(key,li);
            }
        }
        for(String val : map.keySet()){
            list.add(map.get(val));
        }
        return list;
    }
}
