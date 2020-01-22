package app.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * LinkedListStack
 */
public class LinkedListStack<E> {

    private LinkedList<E> stack;

    // constructor
    public LinkedListStack() {

        stack = new LinkedList<E>();

    }

    public void push(E element) {
        stack.push(element);

    }

    public E pop() {
        return stack.pop();

    }

    public E peek() {
        return stack.peek();

    }

    public boolean isEmpty() {

        return stack.isEmpty();

    }

    public void printStack() {

        ListIterator<E> iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}