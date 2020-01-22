package app.stack;

import app.linkedlist.Person;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // Array stack
        ArrayStack<Person> stack = new ArrayStack<Person>(10);

        System.out.println("Array stack: ");

        stack.push(new Person("Bob", 20));
        stack.push(new Person("Bobby", 21));
        stack.push(new Person("Billy", 22));

        System.out.println("\npeek: " + stack.peek() + "\n");
        stack.printStack();

        System.out.println("\npopped: " + stack.pop() + "\n");
        stack.printStack();

        System.out.println("\n------------------------------------");

        // LinkedList Stack
        LinkedListStack<Person> stack2 = new LinkedListStack<Person>();

        System.out.println("LinkedList stack: ");

        stack2.push(new Person("John", 45));
        stack2.push(new Person("Mary", 46));
        stack2.push(new Person("Eric", 47));

        System.out.println("\npeek: " + stack2.peek() + "\n");
        stack2.printStack();

        System.out.println("\npopped: " + stack2.pop() + "\n");
        stack2.printStack();

    }

}