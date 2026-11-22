class Solution:
    def missingNumber(self, nums):
        # Intuition: after sorting, nums[i] should equal i
        n = len(nums)
        nums.sort()
        for i in range(n):
            if nums[i] != i:
                return i
        return n