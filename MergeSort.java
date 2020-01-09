package app;

import java.util.Arrays;

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

        int[] array = { 10, 9, 7, 6, -8 };
        int[] array2 = { 5, 4, 3, 2, -1, 0 };

        mergeSort(array, 0, array.length);
        display(array);

        mergeSort2(array2, 0, array2.length - 1);
        display(array2);
    }

    public static void mergeSort(int[] array, int start, int end) {

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

    public static void mergeSort2(int[] array, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;
            mergeSort2(array, low, mid);
            mergeSort2(array, mid + 1, high);
            merge2(array, low, mid, high);
        }

    }

    public static void merge2(int[] array, int low, int mid, int high) {

        int[] temp = new int[high + 1];
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;

            } else {
                temp[k] = array[j];
                j++;

            }
            k++;
        }

        if (i > mid) {
            while (j <= high) {
                temp[k] = array[j];
                j++;
                k++;
            }
        } else {

            while (i <= mid) {
                temp[k] = array[i];
                i++;
                k++;

            }

        }
        for (int m = low; m <= high; m++) {
            array[m] = temp[m];

        }
    }

    // display array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }
}