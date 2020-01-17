package app.linkedlist;

/**
 * DoubleLinkedList
 */
public class DoubleLinkedList<T> {
    // fields

    // first element
    private Node<T> head;

    // last element
    private Node<T> tail;

    private int size;

    public Node<T> removeFromTail() {

        // if list is empty, then there is nothing to remove
        if (isEmpty()) {
            return null;

        }

        /// set the last element to be removed
        Node<T> removed = tail;

        // check if there is only one node in the list set tail & head to null
        if (tail.getPrevious() == null) {
            head = null;

        } else {
            // set the previous element to be the last one
            tail.getPrevious().setNext(null);
        }
        // the new tail is now the previous one
        tail = tail.getPrevious();

        // decrement size
        size--;

        // clean
        removed.setPrevious(null);

        return removed;
    }

    public Node<T> removeFromFront() {

        // if list is empty, then there is nothing to remove
        if (isEmpty()) {
            return null;

        }
        // store first node to be removed
        Node<T> removed = head;

        // check if there is only one node in the list set tail to null
        if (head.getNext() == null) {
            tail = null;

        } else {
            head.getNext().setPrevious(null);
        }

        // move the head to be next;
        head = head.getNext();

        // set too null to be clean
        removed.setNext(null);

        // decrements size since removed an item
        size--;

        // return the removed element
        return removed;

    }

    public void addToTail(T data) {

        Node<T> node = new Node<T>(data);

        // if list empty add first element to head
        if (tail == null) {
            head = node;

        } else {

            // set
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;

        size++;

    }

    public void addToFront(T data) {

        // create the new node with the person we want to add
        Node<T> node = new Node<T>(data);

        // if list empty last element to node
        if (head == null) {
            tail = node;

        } else {
            // set the next node to the first element(head)
            node.setNext(head);
            // set te previous element to the element we want to add
            head.setPrevious(node);
        }

        // and then insert the new element to be first(head)
        head = node;

        // count elements in list
        size++;

    }

    // check if list is empty
    public boolean isEmpty() {
        return head == null;

    }

    public void printList() {
        // current element t be the first one in the list
        Node<T> current = head;

        System.out.print("head -> ");

        // while current has elements print them all
        while (current != null) {

            System.out.print(current);
            System.out.print(" -> ");

            // set current to be in the next position
            current = current.getNext();

        }
        // no more elements so print null
        System.out.println("null");

    }

    public int getSize() {
        return size;
    }

}