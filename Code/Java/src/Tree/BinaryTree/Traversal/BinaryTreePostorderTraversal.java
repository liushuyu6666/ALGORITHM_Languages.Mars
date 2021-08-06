package Tree.BinaryTree.Traversal;

import Tree.BinaryTree.Dependency.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> upper = new Stack<>();
        Stack<TreeNode> lower = new Stack<>();
        TreeNode curr;
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        upper.push(root);
        while(!upper.isEmpty()){
            curr = upper.pop();
            if(curr.left != null) upper.push(curr.left);
            if(curr.right != null) upper.push(curr.right);
            lower.push(curr);
        }
        while(!lower.isEmpty()){
            ans.add(lower.pop().val);
        }
        return ans;
    }
}
