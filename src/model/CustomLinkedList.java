package model;

public class CustomLinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public CustomIterator<E> iterator() {
        return new CustomIterator<>(head);
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class CustomIterator<E> implements java.util.Iterator<E> {
        private Node<E> current;

        public CustomIterator(Node<E> head) {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements");
            }
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}
