package ChainedDataStructures.Queue.Deque;

import java.util.NoSuchElementException;

public class dobbeltChainNoder<E> implements Deque<E>{

    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E element) {
            this.element = element;
        }

    }
    private Node<E> head;
    private Node<E> tail;
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void addFirst(E newElement) {
        Node<E> newNode = new Node<>(newElement);
        if (head == null) {
            head = newNode;
        }
        else {
           newNode.next = head;
           head.previous = newNode;
           head = newNode;
        }

    }

    @Override
    public void addLast(E newElement) {
        Node<E> newNode = new Node<>(newElement);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }

    }

    @Override
    public E removeFirst() {
        E element = head.element;
        head = head.next;
        return element;
    }

    @Override
    public E removeLast() {
        E element = tail.element;
        tail = tail.previous;
        tail.next = null;
        return element;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        if (head == null) {
            return head.next.element;
        }
        return head.element;
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        if (tail == null) {
            return tail.previous.element;
        }
        return tail.element;

    }

    @Override
    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
