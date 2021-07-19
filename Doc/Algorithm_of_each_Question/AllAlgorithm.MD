# Dynamic Programming

## Kill Process

### source

leetcode: https://leetcode-cn.com/problems/kill-process/

### solution

**KillProcessFind:** use find method in UnionFind to search the parent and record along the trace. We use array to record each node, but when we use `Arrays.fill()`, `indexOf`, which will take `2*n` time complexity. 

**KillProcessRDFS:** build map tree and DFS.

**KillProcessRBFS:** like KillProcessRDFS, but do BFS.

