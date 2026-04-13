class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];

        // 1. Build frequency map: O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 2. Bucket sort by frequency: O(N)
        // List array where index is frequency, value is list of numbers with that frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // 3. Gather top K: O(N)
        int[] result = new int[k];
        int counter = 0;
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int val : bucket[i]) {
                    result[counter++] = val;
                    if (counter == k) return result;
                }
            }
        }

        return result;
    }
}
