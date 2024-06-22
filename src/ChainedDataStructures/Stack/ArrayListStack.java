package ChainedDataStructures.Stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack<E> implements StackEaaa<E>{

    ArrayList<E> stackArrayList = new ArrayList<>();

    @Override
    public void push(E element) {
        stackArrayList.add(stackArrayList.size(), element);
    }

    @Override
    public E pop() {
        E removedElement = stackArrayList.get(stackArrayList.size() - 1);
        stackArrayList.remove(stackArrayList.size() - 1);
        return removedElement;
    }

    @Override
    public E peek() {
        if (stackArrayList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return stackArrayList.get(stackArrayList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stackArrayList.isEmpty();
    }

    @Override
    public void clear() {
        stackArrayList.clear();
    }

    @Override
    public int size() {
        return stackArrayList.size();
    }



}
