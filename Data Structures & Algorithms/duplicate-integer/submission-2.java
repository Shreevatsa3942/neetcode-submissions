class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> elements = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(elements.contains(nums[i])){
                return true;
            }
            elements.add(nums[i]);
        }

        return false;
 
    }
}
