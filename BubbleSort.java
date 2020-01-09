package app;

import java.util.Arrays;

public class BubbleSort {

    // Bubble sort algorithm is O(n^2) quadratic time complexity
    // not really good to use in real world but good to learn.

    public static void main(String[] args) throws Exception {

        // one way to do it
        int[] array = { 5, 6, 7, 1, 3, 2, 4 };

        int[] unsorted = { 100, -2, -36, 89, 1, 90, 49 };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
        display(array);

        // second way using swap method
        for (int lastUnsortedIndex = unsorted.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    swap(unsorted, j, j + 1);
                }

            }

        }
        display(unsorted);
    }

    // swap helper method
    public static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;

        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    // display array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }
}