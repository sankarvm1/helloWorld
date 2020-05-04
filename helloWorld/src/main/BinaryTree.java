package main;

import java.util.HashMap;

public class BinaryTree {
    Map<Integer, Integer> map = new HashMap();
    private Node Head = null;
    public Node getHead() {
        return Head;
    }

    public void setHead(final Node head) {
        Head = head;
    }
}
