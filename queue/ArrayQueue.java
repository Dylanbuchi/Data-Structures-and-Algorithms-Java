package app.queue;

import java.util.NoSuchElementException;

/**
 * Queue
 */
public class ArrayQueue<E> {

    // Abstract data type
    // FIFO first in, first out
    // add to end of queue
    // remove from front
    // peek the item from the front without removing it

    private E[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = (E[]) new Object[capacity];

    }

    public void add(E element) {

        if (back == queue.length) {
            E[] temp = (E[]) new Object[2 * queue.length];
            System.arraycopy(queue, 0, temp, 0, queue.length);
            queue = temp;

        }
        queue[back] = element;
        back++;
    }

    public E remove() {

        if (size() == 0) {
            throw new NoSuchElementException();
        }

        E element = queue[front];
        queue[front] = null;
        front++;

        // resets the queue
        if (size() == 0) {
            front = 0;
            back = 0;

        }
        return element;

    }

    public E peek() {

        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];

    }

    public int size() {

        return back - front;

    }

    public void printQueue() {

        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);

        }

    }

}