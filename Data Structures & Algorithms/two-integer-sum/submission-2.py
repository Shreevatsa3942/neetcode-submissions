class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        sum_map = {}

        for i,val in enumerate(nums): 
            diff = target - val

            if diff in sum_map:
                res = sum_map[diff]
                return [res,i]
            
            sum_map[val] = i 
        
        return [-1,-1]

        