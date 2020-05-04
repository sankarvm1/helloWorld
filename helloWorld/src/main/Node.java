package main;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;

    }
    public void setLeft(final Node left) {
        this.left = left;
    }

    public void setRight(final Node right) {
        this.right = right;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
