package app.hashtable;

/**
 * HashTable
 */
public class HashTable<E> {
    // abstract data type
    // uses keys to get data
    // good for retrieval

    private E[] hashtable;

    public HashTable() {

        hashtable = (E[]) new Object[10];

    }

    private int hashKey(String key) {

        // hashing function to get index for the key
        return key.length() % hashtable.length;
    }

    public void put(String key, E element) {

        // hash the key to get it index position
        int hashedKey = hashKey(key);

        // if the index is already in use
        if (hashtable[hashedKey] != null) {
            System.out.println("This index is already used");

        } else {

            // if empty then we store the element
            hashtable[hashedKey] = element;

        }

    }

    public E get(String key) {

        int hashedKey = hashKey(key);

        return hashtable[hashedKey];

    }

    public void print() {

        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);

        }

    }
}