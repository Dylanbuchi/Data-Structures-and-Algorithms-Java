package app.linkedlist;

/**
 * ok
 */
public class Node {

    private Person p;
    private Node next;

    public Node(Person p) {
        this.p = p;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return p.toString();

    }

}