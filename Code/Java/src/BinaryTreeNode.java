import org.graalvm.compiler.nodes.SimplifyingGraphDecoder;

import jdk.nashorn.api.tree.BinaryTree;

public class BinaryTreeNode {
    String binaryNodeValue;
    BinaryTreeNode rightBinaryNode;
    BinaryTreeNode leftBinaryNode;

    public BinaryTreeNode(String binaryNodeValue, BinaryTreeNode righTreeNode, BinaryTreeNode leftTreeNode
    ){
        this.binaryNodeValue = binaryNodeValue;
        this.rightBinaryNode = righTreeNode;
        this.leftBinaryNode = leftTreeNode;
    }
}
