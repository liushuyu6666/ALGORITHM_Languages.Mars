from typing import List

from src import TreeNode


class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        curr = root
        stack = []
        ans = []
        while curr is not None or len(stack) > 0:
            if curr is not None:
                stack.append(curr)
                curr = curr.left
            else:
                curr = stack.pop()
                ans.append(curr.val)
                curr = curr.right
        return ans


def main():
    solution = Solution()


if __name__ == "__main__":
    main()
