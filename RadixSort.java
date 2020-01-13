package app;

import java.util.Arrays;

/**
 * RadixSort
 */
public class RadixSort {

    // Uses Counting Sort algorithm for Radix sort
    // data must be of type Integer or String
    // data must have same width number --> (1234) is 4 of width
    // O(n) best case here since we know the data otherwise is O(nlogn)
    // Stable algorithm
    public static void main(String[] args) {
        RadixSort rs = new RadixSort();

        // array of width of 4
        int[] array = { 4567, 5678, 1234, 9023, 3456 };

        rs.radixSort(array, 10, 4);
        display(array);
    }

    public void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);

        }

    }

    private void radixSingleSort(int[] array, int position, int radix) {
        int numItems = array.length;

        int[] countArray = new int[radix];

        for (int value : array) {
            countArray[getDigit(position, value, radix)]++;

        }

        // adust the countArray
        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];

        }

        int[] temp = new int[numItems];

        for (int i = numItems - 1; i >= 0; i--) {
            temp[--countArray[getDigit(position, array[i], radix)]] = array[i];

        }
        for (int i = 0; i < numItems; i++) {
            array[i] = temp[i];

        }
    }

    private int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

    // display array
    public static void display(int[] a) {
        String s = Arrays.toString(a);
        System.out.println(s);

    }
}