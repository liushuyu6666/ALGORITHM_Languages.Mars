package Tree.BinaryTree.Traversal;

import Tree.BinaryTree.Dependency.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode curr = root;
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> upper = new LinkedList<>();
        Queue<TreeNode> lower = new LinkedList<>();
        if(curr == null) return ans;
        upper.add(curr);
        while(!upper.isEmpty() || !lower.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            if(!upper.isEmpty()){
                while(!upper.isEmpty()){
                    curr = upper.poll();
                    inner.add(curr.val);
                    if(curr.left != null) lower.add(curr.left);
                    if(curr.right != null) lower.add(curr.right);
                }
                ans.add(inner);
            }
            else{
                while(!lower.isEmpty()){
                    curr = lower.poll();
                    inner.add(curr.val);
                    if(curr.left != null) upper.add(curr.left);
                    if(curr.right != null) upper.add(curr.right);
                }
                ans.add(inner);
            }
        }
        return ans;
    }
}
