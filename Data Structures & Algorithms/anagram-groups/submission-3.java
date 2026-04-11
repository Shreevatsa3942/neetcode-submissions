class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String str: strs){
            int []chset = new int[26];
            for(char ch: str.toCharArray()){
                chset[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: chset){
                sb.append('#').append(i);
            }
            String key = sb.toString();
            ArrayList<String> list = map.get(key);
            if(list == null) list = new ArrayList<>();
            list.add(str);
            map.put(key,list);
            
        }
        
        return new ArrayList<>(map.values());
    }
}
