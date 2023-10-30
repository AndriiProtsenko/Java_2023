import java.util.Scanner;

public class lab4_task64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Array size must be greater than 0");
        }

        int[] originalArray = new int[n];
        int[] modifiedArray = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
            int modifiedValue;

            if (originalArray[i] < 0) {
                modifiedValue = -1 * originalArray[i];
            } else if (originalArray[i] > 0) {
                modifiedValue = originalArray[i] - 3;
            } else {
                modifiedValue = -2;
            }

            modifiedArray[i] = modifiedValue;
        }

        System.out.println("Original Array: ");
        printArray(originalArray);

        System.out.println("Modified Array: ");
        printArray(modifiedArray);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}