package app.linkedlist;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Person one = new Person("John", 23);
        Person two = new Person("Paul", 45);
        Person p = new Person("Jimmy", 67);
        Person p2 = new Person("Billy", 18);

        // Single list
        LinkedList<Person> list = new LinkedList<Person>();

        System.out.println(list.isEmpty());

        list.addToFront(one);
        list.addToFront(two);
        list.addToFront(p);

        list.removeFromFront();
        list.printList();

        System.out.println("size is " + list.getSize());
        System.out.println(list.isEmpty());

        // Double list
        DoubleLinkedList<Person> listD = new DoubleLinkedList<Person>();

        listD.addToFront(one);
        listD.addToFront(two);
        listD.addToFront(p);

        listD.addToTail(p2);
        listD.removeFromTail();

        listD.printList();

    }

}