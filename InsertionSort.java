package app;

import java.util.Arrays;

public class InsertionSort {

    // Insertion Sort algorithm is O(n2) quadratic time complexity
    // Stable algorithm
    // in place algorithm

    public static void main(String[] args) {

        int[] array = { 5, 6, 7, 1, 3, 2, 4 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {

                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }

        display(array);
    }

    // display array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }
}