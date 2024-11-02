class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        unique = set(nums)
        if (len(nums) != len(unique)):
            return True
        return False