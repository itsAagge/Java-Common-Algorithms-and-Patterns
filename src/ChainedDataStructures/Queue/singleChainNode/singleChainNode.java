package ChainedDataStructures.Queue.singleChainNode;

import java.util.NoSuchElementException;

public class singleChainNode<E> implements Queue<E>{

    private Node<E> head;
    private Node<E> tail;

    private static class Node<E> {
        private E element;
        private Node next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }

    }


    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            tail = newNode;
            head = tail;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Node<E> removedElement = head;
        head = head.next;
        return removedElement.element;
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
