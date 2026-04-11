class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            char[] chars = strs[i].toCharArray(); // Convert to char array
            Arrays.sort(chars);                   // Sort the array in-place
            String key = new String(chars); 
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>()); // Create if it doesn't exist
            }
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
