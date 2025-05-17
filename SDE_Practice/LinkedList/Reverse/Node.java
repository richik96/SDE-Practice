package SDE_Practice.LinkedList.Reverse;

public class Node {
    public int data;
    public Node next;

    public Node() {
    }

    public Node(int new_data) {
        data = new_data;
        next = null;
    }

    @Override
    public String toString() {
        return data +
                "-->"+next;
    }
}
