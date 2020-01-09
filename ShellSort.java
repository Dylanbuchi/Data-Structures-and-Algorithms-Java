package app;

import java.util.Arrays;

/**
 * ShellSort
 */
public class ShellSort {

    // Shell Sorting algorithm is O(n2) (worst case) quadratic time complexity
    // because it can vary depending on the gap
    // Unstable algorithm
    // in place algorithm

    public static void main(String[] args) {

        int[] array = { 5, 6, 7, 1, 3, 2, 4, -9 };

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {

                int temp = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];

                    j -= gap;

                }
                array[j] = temp;

            }
        }

        display(array);
    }

    // display array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }
}