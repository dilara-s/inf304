package ru.itis.inf304;

public class NextNumImpl implements NextNum{
    private Node current;
    public NextNumImpl() {
        Node root = new Node (1);
        current = root;
        for (int i = 1; i <= 10; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        current.next = root;
    }
    @Override
    public int next() {
        int result = current.value;
        current = current.next;
        return result;
    }
}
