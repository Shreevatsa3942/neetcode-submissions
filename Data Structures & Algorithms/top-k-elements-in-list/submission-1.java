class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) return new int[]{};
        Map<Integer,Integer> frequency = new HashMap<Integer,Integer>();

        int []result = new int[k];
        for(int i=0;i<nums.length;i++){
            frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);
        }

        //Bucket Sort 
        List<Integer> []bucket = new ArrayList[nums.length+1];

        for(int key: frequency.keySet()){
            int freq = frequency.get(key);

            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<Integer>();
            }
            bucket[freq].add(key);
        }

        int count = 0;
        for(int i=bucket.length-1;i>=0 && count < k;i--){
            if(bucket[i] != null){
                for(int ele: bucket[i]){
                    result[count] = ele;
                    count++;

                    if(count >= k) return result;              
                }
            }
        }

        return result;

    }
}
