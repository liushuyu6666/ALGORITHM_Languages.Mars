from typing import List


class Solution:
    def __init__(self):
        pass

    def setZeroes(self, matrix: List[List[int]]) -> None:
        row = False
        col = False
        origin = False
        if matrix[0][0] == 0:
            origin = True
        for i in range(1, len(matrix), 1):
            if matrix[i][0] == 0:
                col = True
                break
        for j in range(1, len(matrix[0]), 1):
            if matrix[0][j] == 0:
                row = True
                break
        for i in range(1, len(matrix), 1):
            for j in range(1, len(matrix[0]), 1):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0

        for i in range(1, len(matrix), 1):
            if matrix[i][0] == 0:
                for j in range(1, len(matrix[0]), 1):
                    matrix[i][j] = 0
        for j in range(1, len(matrix[0]), 1):
            if matrix[0][j] == 0:
                for i in range(1, len(matrix), 1):
                    matrix[i][j] = 0
        if col:
            for i in range(0, len(matrix), 1):
                matrix[i][0] = 0
        if row:
            for j in range(0, len(matrix[0]), 1):
                matrix[0][j] = 0
        if origin:
            for i in range(0, len(matrix), 1):
                matrix[i][0] = 0
            for j in range(0, len(matrix[0]), 1):
                matrix[0][j] = 0


def main():
    solution = Solution()
    matrix = [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]]
    solution.setZeroes(matrix)
    print(matrix)


if __name__ == "__main__":
    main()
