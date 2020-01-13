package app;

import java.util.Arrays;

/**
 * CountingSort
 */
public class CountingSort {

    // only works with positives values
    // Not an in-place algorithm
    // O(n) linear time best case
    // key value is the max element in the array
    // range is 0 - key

    public static void main(String[] args) {
        CountingSort cs = new CountingSort();

        int[] array = { 20, 1, 1, 20, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9 };
        int key = 20;
        cs.countingSort(array, 0, key);
        display(array);

    }

    public void countingSort(int[] array, int min, int key) {

        // create the count array for counting
        int[] countArray = new int[key + 1];

        for (int i = 0; i < array.length; i++) {

            // translate the value to count into the correct index
            ++countArray[array[i]];

        }

        // index to use
        int j = 0;

        // traverse the count array
        for (int i = min; i <= key; i++) {

            while (countArray[i] > 0) {
                array[j++] = i;
                countArray[i]--;

            }

        }

    }

    // print array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }

}