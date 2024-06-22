package ChainedDataStructures.Queue.doubleChainNode;

import ChainedDataStructures.Queue.singleChainNode.Queue;

import java.util.NoSuchElementException;

public class dobbeltChainNoder<E> implements Queue<E> {

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
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            tail = newNode;
            head = tail;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        E RemovedElement = head.element;
        head = head.next;
        return RemovedElement;
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return head.element;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        head = null;

    }

    @Override
    public int size() {
        Node<E> current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }
}
