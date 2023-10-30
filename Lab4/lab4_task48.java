import java.util.Scanner;

public class lab4_task48 {
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
            if (i % 2 == 0 && array[i] < 0) {
                System.out.println("Error: Number at even index is negative!");
                break;
            }
        }

        double geometricMean = findGeometricMeanOfEvenMultipleOfFiveElements(array);
        System.out.println("Geometric mean of even elements with indices multiple of 5: " + geometricMean);
    }

    public static double findGeometricMeanOfEvenMultipleOfFiveElements(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int count = 0;
        double product = 1.0;

        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0 && array[i] % 2 == 0) {
                product *= array[i];
                count++;
            }
        }

        if (count == 0) {
            return 0.0; // Якщо не знайдено відповідних елементів, повертаємо 0.0
        }

        return Math.pow(product, 1.0 / count);
    }
}