class Solution {
    public boolean isAnagram(String s, String t) {

        //bruteforce Time : O(nlogn) - Sorting

        /*char str1[] = s.toCharArray();
        Arrays.sort(str1);
        char []str2 = t.toCharArray();
        Arrays.sort(str2);

        String st1 = Arrays.toString(str1);
        String st2 = Arrays.toString(str2);

        if(st1.equals(st2)) return true; 
        else return false; */

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(char ch: t.toCharArray()){
            int count = map.getOrDefault(ch,0);
            if(count == 0) return false;
            map.put(ch, map.get(ch)-1);
        }

        for (Integer val : map.values()) {
            // Check for null to prevent NPE during comparison
            if (val == null || val != 0) {
                return false;
            }
        }
        return true;
    }
}
