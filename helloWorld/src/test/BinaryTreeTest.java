package test;

import org.junit.Test;

import main.BinaryTree;
import main.Node;

public class BinaryTreeTest {
    @Test
    public void testTree() {
        BinaryTree binaryTree = new BinaryTree();
        Node node1 = new Node(1);
        binaryTree.setHead(node1);
        System.out.println(binaryTree.getHead().getValue());
    }
}
