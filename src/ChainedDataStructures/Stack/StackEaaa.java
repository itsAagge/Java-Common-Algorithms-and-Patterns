package ChainedDataStructures.Stack;

public interface StackEaaa<E> {
    /**
     * Add the element at the top of this stack.
     */
    void push(E element);

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    E pop();

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    E peek();

    /**
     * Return true, if this stack is empty.
     */
    boolean isEmpty();

    /**
     * Remove all elements from this stack.
     */
    void clear();

    /**
     * Return the number of elements in this stack.
     */
    int size();

}
