package app.stack;

import java.util.EmptyStackException;

/**
 * ArrayStack
 */
public class ArrayStack<E> {

    private E[] stack;

    // track the next top element
    private int top;

    // constructor with initial capacity
    public ArrayStack(int capacity) {
        stack = (E[]) new Object[capacity];

    }

    public void push(E element) {

        if (top == stack.length) {
            // need to resize the array since it's full
            E[] array = (E[]) new Object[2 * stack.length];

            // copy
            System.arraycopy(stack, 0, array, 0, stack.length);

            // resized!
            stack = array;

        }

        stack[top++] = element;

    }

    public E pop() {

        // throw exception if empty
        if (isEmpty()) {
            throw new EmptyStackException();

        }

        // pop the employee
        E element = stack[--top];

        // then set it's place to null
        stack[top] = null;

        // return the popped element
        return element;

    }

    public boolean isEmpty() {
        return top == 0;

    }

    public E peek() {

        // throw exception if empty
        if (isEmpty()) {
            throw new EmptyStackException();

        }

        return stack[top - 1];
    }

    public int size() {
        return top;

    }

    public void printStack() {

        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);

        }

    }

}