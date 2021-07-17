class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        letters = tuple(s)
        ans = 0
        left, right = 0, 0
        pos = dict()
        while right < len(letters):
            if letters[right] not in pos.keys():
                pos[letters[right]] = right
                right += 1
            else:
                left = max(pos[letters[right]] + 1, left)
                pos[letters[right]] = right
                right += 1
            ans = max(right - left, ans)
        return ans


def main():
    solution = Solution()
    print(solution.lengthOfLongestSubstring("pwwkew"))
    print(solution.lengthOfLongestSubstring("abba"))


if __name__ == "__main__":
    main()
