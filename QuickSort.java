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
        QuickSort q = new QuickSort();

        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] array2 = { 20, 45, 50, -2, 0, 1, 3, 2, 9, 5 };

        // method 1
        q.quickSort(array, 0, array.length);
        display(array);

        // method 2
        q.quickSort2(array2, 0, array2.length - 1);
        display(array2);

    }

    public void quickSort(int[] array, int left, int right) {

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
    private int partition(int[] array, int left, int right) {

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

    private int partition2(int array[], int low, int high) {

        // pivot element chosen is at element array[0];
        int pivot = array[low];

        // variables to traverse indexes
        int start = low; // = 0
        int end = high; // = last index

        // while starting index doesn't cross ending index
        while (start < end) {

            // while element at index 0 is < than pivot element at array[0]
            while (array[start] < pivot) {

                // increment index 0 by 1
                start++;
                // start goes to left to right

            }
            // while element at last index is > than pivot element at array[0]
            while (array[end] > pivot) {

                // decrement last index by 1;

                end--; // end goes from right to left

            }

            // swap when out of the 2 while loops;
            swap(array, start, end);

        }

        // when main while loop ends means that start crossed end (start > end)
        // so now swap and return
        // end to be the correct pivot index

        swap(array, end, start);

        return end;

    }

    // swap helper method
    public void swap(int array[], int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public void quickSort2(int array[], int low, int high) {

        // break statements for recursive calls
        if (low <= high) {

            // correct pivot index is returned from partition method
            int pivotIndex = partition2(array, low, high);

            // then call method again to divide and sort in sub arrays until low >= high
            quickSort2(array, low, pivotIndex - 1);
            quickSort2(array, pivotIndex + 1, high);

        }

    }

    // display array helper method
    public static void display(int[] array) {
        String s = Arrays.toString(array);
        System.out.println(s);

    }
}