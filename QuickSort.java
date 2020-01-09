package app;

import java.util.Arrays;

/**
 * QuickSort
 */
public class QuickSort {

    // Time complexity of O(nLogn) base 2 logarithmic
    // "Divide and Conquer" Algorithm
    // Recursive Algorithm
    // In-place Algorithm
    // Unstable Algorithm

    public static void main(String[] args) {

        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        quickSort(array, 0, array.length);
        display(array);
    }

    public static void quickSort(int[] array, int left, int right) {

        if (right == left) {
            return;

        }
        // put pivot in correct index and everything in the left < pivot & right > pivot
        int pivotIndex = partition(array, left, right);

        // sort all the left array first before going to next method
        quickSort(array, left, pivotIndex);

        // then it sort all the right of the array
        quickSort(array, pivotIndex + 1, right);

    }

    // return the correct position of the pivot index in the sorted array
    private static int partition(int[] array, int left, int right) {

        int pivot = array[left];

        // traversal variables that will traverse the array
        int l = left;
        int r = right;

        while (l < r) {

            // empty loop body
            while (l < r && array[--r] >= pivot)
                ;

            if (l < r) {
                array[l] = array[r];

            }
            // empty loop body
            while (l < r && array[++l] <= pivot)
                ;

            if (l < r) {
                array[r] = array[l];
            }

        }
        array[r] = pivot;
        return r;
    }

    // display array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }
}