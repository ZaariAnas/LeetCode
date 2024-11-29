class Solution(object):
    def findClosestNumber(self, nums):
        if not nums:
            return None
        min_num = nums[0]
        to_compare = abs(nums[0])
        for num in nums:
            if abs(num) < to_compare:
                min_num = num
                to_compare = abs(num)
            if abs(min_num) == num:
                min_num = abs(num)
        return min_num
        