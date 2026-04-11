class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length < 2) return false;
        //bruteforce Time: O(n^2) Space O(1)
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }*/

        //Optimized Time: O(n) Space: O(n);
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;

            set.add(nums[i]);
        }

        return false;
        
    }
}