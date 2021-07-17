from typing import List


class Solution:
    def __init__(self):
        pass

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime = self.primeNumber(26)
        dct = {}
        for word in strs:
            eigen = self.calculateEigenValue(word, prime)
            if eigen in dct.keys():
                words = dct[eigen]
                words.append(word)
            else:
                dct[eigen] = [word]
        return [word for word in dct.values()]

    def calculateEigenValue(self, string: str, prime: List[int]) -> int:
        eigen = 1
        for letter in tuple(string):
            eigen *= prime[ord(letter) - ord('a')]
        return eigen

    def primeNumber(self, num: int) -> List[int]:
        bound = 120
        prime = [True for _ in range(bound)]
        prime[0] = False
        prime[1] = False
        cnt = 0
        for i in range(bound):
            if prime[i]:
                t = i * i
                cnt += 1
                if cnt == num:
                    return [j for j in range(i + 1) if prime[j]]
                while t < bound:
                    prime[t] = False
                    t += i


def main():
    solution = Solution()
    print(solution.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
    print(solution.groupAnagrams([""]))
    print(solution.groupAnagrams(["a"]))


if __name__ == "__main__":
    main()
