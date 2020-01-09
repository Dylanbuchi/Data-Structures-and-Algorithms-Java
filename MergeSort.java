package app;

import java.util.Arrays;
import java.util.Base64.Encoder;

/**
 * MergeSort
 */
public class MergeSort {

    // Merge Sorting algorithm is O(nLogn) base 2 logarithmic time complexity
    // 2 phases Splitting and Merging, and the split is logical
    // Recursive algorithm
    // "Divide & Conquer" Algorithm
    // Stable Algorithm

    public static void main(String[] args) {

        int[] array = { 10, 9, 8, 7, 6, 1, 0 };
        mergeSort(array, 0, array.length);
        display(array);
    }

    private static void mergeSort(int[] array, int start, int end) {

        if (end - start <= 1) {
            return;

        }

        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);

    }

    public static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) {
            return;

        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[array.length];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];

        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);

    }

    // display array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }
}