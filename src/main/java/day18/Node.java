package day18;

public class Node {
    private int nodeInt;
    private Node leftSon;
    private Node rightSon;

    public Node(int nodeInt) {
        this.nodeInt = nodeInt;
    }

    public int getNodeInt() {
        return nodeInt;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }
}

