from typing import List


class Solution:
    def __init__(self):
        pass

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = set()
        if len(nums) < 3:
            return list(ans)
        nums.sort()
        i = 0
        t = (nums[i] <= 0)
        d = (i < len(nums))
        w = t and d
        while i < len(nums) and nums[i] <= 0:
            left = i + 1
            right = len(nums) - 1
            while left < len(nums) and right > i and left < right:
                if nums[i] + nums[left] + nums[right] == 0:
                    ans.add((nums[i], nums[left], nums[right]))
                    left += 1
                    while left < len(nums) and nums[left] == nums[left - 1]:
                        left += 1
                    right -= 1
                    while right > i and nums[right] == nums[right + 1]:
                        right -= 1
                elif nums[i] + nums[left] + nums[right] > 0:
                    right -= 1
                    while right > i and nums[right] == nums[right + 1]:
                        right -= 1
                else:
                    left += 1
                    while left < len(nums) and nums[left] == nums[left - 1]:
                        left += 1
            i += 1
            while i < len(nums) and nums[i] == nums[i - 1]:
                i += 1
        return [list(ele) for ele in ans]


def main():
    solution = Solution()
    print(solution.threeSum(list((-1, 0, 1, 2, -1, -4))))


if __name__ == "__main__":
    main()
