import java.util.Arrays;

public class lab5 {
    public static void main(String[] args) {
        long[] a = {21, -72, 2, 349, 232, -84, 68, -1, 23, 25};
        long[] b = {-34, -54, 131, 56, -12, -27, 66, 42, -7, 42};

        long[] aCopy = Arrays.copyOf(a, a.length);
        long[] bCopy = Arrays.copyOf(b, b.length);

        printSortedArray("Insertion Sort", aCopy, insertionSort(aCopy));
        printSortedArray("Bubble Sort", bCopy, bubbleSort(bCopy));
    }

    static long[] insertionSort(long[] arr) {
        arr = Arrays.copyOf(arr, arr.length); // Створюємо копію масиву
        for (int i = 1; i < arr.length; i++) {
            long key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static long[] bubbleSort(long[] arr) {
        arr = Arrays.copyOf(arr, arr.length); // Створюємо копію масиву
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static void printSortedArray(String sortMethod, long[] originalArray, long[] sortedArray) {
        System.out.println(sortMethod + ":\nOriginal array: " + Arrays.toString(originalArray) +
                "\nSorted array: " + Arrays.toString(sortedArray) + "\n");
    }
}
