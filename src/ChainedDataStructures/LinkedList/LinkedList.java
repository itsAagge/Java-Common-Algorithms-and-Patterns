package ChainedDataStructures.LinkedList;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private Node<E> tail;

    //Inner class
    private class Node<E> {
        private final E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public void add(E e) {
        Node<E> node = new Node<>(e);
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public boolean remove(E e) {
        boolean removed = false;
        if (head.getElement().equals(e)) {
            removeFirst();
            removed = true;
        }
        Node<E> current = head.getNext();
        Node<E> last = head;
        while (current != null && !removed) {
            if (current.getElement().equals(e)) {
                if (current == tail) {
                    last.setNext(null);
                    tail = last;
                } else {
                    last.setNext(current.getNext());
                }
                removed = true;
            }
            last = current;
            current = current.getNext();
        }
        return removed;
    }

    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        node.setNext(head);
        head = node;
    }

    public E getFirst() {
        return head.getElement();
    }

    public void removeFirst() {
        head = head.getNext();
    }

    public boolean contains(E e) {
        Node<E> current = head;
        boolean found = false;
        while (current != null) {
            if (current.getElement().equals(e)) {
                found = true;
            }
            current = current.getNext();
        }
        return found;
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public int size() {
        Node<E> current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //Without recursion
    /*
    public E get(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getElement();
    }
    */

    //With recursion
    public E get(int index) {
        if (index >= this.size() || index < 0) {
            throw new IllegalArgumentException("Index must be max " + (this.size() - 1) + " and at least 0");
        } else {
            Node<E> current = head;
            return getHelper(current, 0, index);
        }
    }

    private E getHelper(Node<E> current, int index, int finalIndex) {
        if (index == finalIndex) {
            return current.getElement();
        } else {
            return getHelper(current.getNext(), index + 1, finalIndex);
        }
    }

    public void add(int index, E e) {
        Node<E> nodeToAdd = new Node<>(e);
        if (index == 0) {
            nodeToAdd.setNext(head);
            head = nodeToAdd;
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            nodeToAdd.setNext(current.getNext());
            current.setNext(nodeToAdd);
        }
    }

    public E remove(int index) {
        if (index == 0) {
            E element = head.getElement();
            removeFirst();
            return element;
        } else {
            Node<E> toBeRemoved = head.getNext();
            Node<E> last = head;
            for (int i = 1; i < index; i++) {
                toBeRemoved = toBeRemoved.getNext();
            }
            if (toBeRemoved.equals(tail)) {
                last.setNext(null);
                tail = last;
            } else {
                last.setNext(toBeRemoved.getNext());
            }
            return toBeRemoved.getElement();
        }
    }

    public int indexOf(E e) {
        int index = 0;
        boolean found = false;
        Node<E> current = head;
        while (current != null && !found) {
            if (current.getElement().equals(e)) {
                found = true;
            } else {
                index++;
            }
            current = current.getNext();
        }
        return index;
    }

    @Override
    public Iterator iterator() {
        Iterator<E> iterator = new Iterator<>() {
            Node<E> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E item = current.getElement();
                current = current.getNext();
                return item;
            }
        };
        return iterator;
    }
}
