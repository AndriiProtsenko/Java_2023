import java.util.Scanner;

public class lab4_task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Array size must be greater than 0");
        }

        int[] array = new int[n];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int minAbsValue = findMinAbsoluteValue(array);
        System.out.println("Minimum absolute value in the array: " + minAbsValue);
    }

    public static int findMinAbsoluteValue(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }

        if (array.length == 0) {
            throw new IndexOutOfBoundsException("Array is empty");
        }

        int minAbsValue = Math.abs(array[0]);
        for (int num : array) {
            int absValue = Math.abs(num);
            if (absValue < minAbsValue) {
                minAbsValue = absValue;
            }
        }
        return minAbsValue;
    }
}