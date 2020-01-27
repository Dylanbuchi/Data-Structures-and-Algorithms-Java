package app.queue;

import app.linkedlist.Person;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Person one = new Person("John", 23);
        Person two = new Person("Paul", 45);
        Person p = new Person("Jimmy", 67);
        Person p2 = new Person("Billy", 18);

        ArrayQueue<Person> queue = new ArrayQueue<Person>(10);

        queue.add(one);
        queue.add(two);
        queue.add(p);
        queue.add(p2);

        queue.printQueue();
        System.out.println("removed: " + queue.remove() + "\n");

        queue.printQueue();
        System.out.println("peeked: " + queue.peek() + "\n");
        queue.printQueue();

    }
}