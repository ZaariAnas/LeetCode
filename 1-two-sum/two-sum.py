class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash_map = {}
        for index, num in enumerate(nums):
            compliment = target - num
            if compliment in hash_map:
                return [hash_map[compliment], index]
            hash_map[num] = index
        return []
