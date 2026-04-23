class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int num:nums){
            set.add(num);
        }

        int longStreak = 0;

        for(int num: set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int streak = 1;

                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    streak++;
                }

                longStreak = Math.max(streak, longStreak);
            }
        }

        return longStreak;
    }
}
