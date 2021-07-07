import java. util.*;


public class SimilarTrees {
    public boolean similarTrees(BinaryTreeNode firstTree, BinaryTreeNode secondTree){
        Queue<BinaryTreeNode> firstStackA = new LinkedList<>();
        Queue<BinaryTreeNode> firstStackB = new LinkedList<>();
        Queue<BinaryTreeNode> secondStackA = new LinkedList<>();
        Queue<BinaryTreeNode> secondStackB = new LinkedList<>();
        
        firstStackA.add(firstTree);
        secondStackA.add(secondTree);

        BinaryTreeNode currFirst;
        BinaryTreeNode currSecond;

        while(!firstStackA.isEmpty() || !firstStackB.isEmpty() ||
        !secondStackA.isEmpty() || !secondStackB.isEmpty()){
            if(firstStackA.size() != secondStackA.size() ||
            firstStackB.size() != secondStackB.size()){
                return false;
            }
            
            // check if Queue A is empty
            if(!firstStackA.isEmpty()){
                while(!firstStackA.isEmpty()){
                    currFirst = firstStackA.poll();
                    if(currFirst.leftBinaryNode != null) firstStackB.add(currFirst.leftBinaryNode);
                    if(currFirst.rightBinaryNode != null) firstStackB.add(currFirst.rightBinaryNode);
                    currSecond = secondStackA.poll();
                    if(currSecond.leftBinaryNode != null) secondStackB.add(currSecond.leftBinaryNode);
                    if(currSecond.rightBinaryNode != null) secondStackB.add(currSecond.rightBinaryNode);
                }
            }
            // check if Queue B is Empty
            else if(!firstStackB.isEmpty()){
                while(!firstStackB.isEmpty()){
                    currFirst = firstStackB.poll();
                    if(currFirst.leftBinaryNode != null) firstStackA.add(currFirst.leftBinaryNode);
                    if(currFirst.rightBinaryNode != null) firstStackA.add(currFirst.rightBinaryNode);
                    currSecond = secondStackB.poll();
                    if(currSecond.leftBinaryNode != null) secondStackA.add(currSecond.leftBinaryNode);
                    if(currSecond.rightBinaryNode != null) secondStackA.add(currSecond.rightBinaryNode);
                }
            }
        }
        return true;
    }
}
