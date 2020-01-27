package app.hashtable;

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

        HashTable<Person> hashTable = new HashTable<Person>();

        hashTable.put("John", one);
        hashTable.put("Paul", two);
        hashTable.put("Jimmy", p);
        hashTable.put("Billy", p2);

        System.out.println("retrieve key John: " + hashTable.get("John"));

    }
}