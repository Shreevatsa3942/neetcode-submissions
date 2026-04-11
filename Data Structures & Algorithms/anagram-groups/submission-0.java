class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String s: strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);

            String sorted_s = new String(c);

            if(!map.containsKey(sorted_s)){
                map.put(sorted_s, new ArrayList<String>());
            }
            
            map.get(sorted_s).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}
