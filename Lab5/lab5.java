package Lab5;

import java.util.Arrays;

public class lab5 {
    public static void main(String[] args) {
        long[] a = {-38, 12, -22, 29, -7, 44, -47, 23, 50, -16};
        long[] b = {-23, 45, -12, 34, -48, 17, 29, -50, 8, 42};
        printInsertionSortedArray(a);
        printBubbleSortedArray(b);
    }

    static long[] insertionSort(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            long key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static long[] bubbleSort(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static void printInsertionSortedArray(long[] arr) {
        System.out.println("array:" + Arrays.toString(arr) + " new array:" + Arrays.toString(insertionSort(arr)));
    }

    static void printBubbleSortedArray(long[] arr) {
        System.out.println("array:" + Arrays.toString(arr) + " new array:" + Arrays.toString(bubbleSort(arr)));
    }

}
