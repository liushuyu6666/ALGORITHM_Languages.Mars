package Tree.BinaryTree.Traversal;

import Tree.BinaryTree.Dependency.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(!stack.isEmpty() || curr != null){
            if(curr != null){
                ans.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            }
            else{
                curr = stack.pop();
                curr = curr.right;
            }
        }
        return ans;
    }
}
