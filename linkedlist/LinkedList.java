package app.linkedlist;

/**
 * LinkedList
 */
public class LinkedList {

    // first element field
    private Node head;
    private int size;

    public Node removeFromFront() {

        // if list is empty, then there is nothing to remove
        if (isEmpty()) {
            return null;

        }
        // store first node to be removed
        Node removed = head;

        // move the head to be next;
        head = head.getNext();

        // set too null to be clean
        removed.setNext(null);

        // decrements size since removed an item
        size--;

        // return the removed element
        return removed;

    }

    public void addToFront(Person person) {
        // create the new node with the person we want to add
        Node node = new Node(person);

        // set the next node to the first element(head)
        node.setNext(head);

        // and then insert the new element to be first(head)
        head = node;

        // count elements in list
        size++;

    }

    public boolean isEmpty() {
        return head == null;

    }

    public void printList() {
        // current element t be the first one in the list
        Node current = head;

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

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

}