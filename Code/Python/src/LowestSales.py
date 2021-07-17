from typing import Counter


class Solution:
    def __init__(self):
        pass

    def nth_lowest_selling(self, sales, n):
        count = dict()
        for book in sales:
            if book in count.keys():
                count[book] += 1
            else:
                count[book] = 1
        # find the n-th lowest
        count = dict(sorted(count.items(), key=lambda item: item[1]))
        keys = list(count.keys())
        if n <= 0 or n > len(count):
            return None
        return keys[n - 1]


def main():
    solution = Solution()
    print(solution.nth_lowest_selling([3, 3, 1, 2, 2, 2], 3))


if __name__ == "__main__":
    main()
