import java.util.InputMismatchException;
import java.util.Scanner;

public class lab3_task14 {
    public static double iFactorial(int i) {
        int sumIfactor = 1;
        for (int n = 1; n <= i; n++) {
            sumIfactor *= n;
        }
        return sumIfactor;
    }

    public double equationOfSum(double E) {
        double sum = 0;
        for (int i = 0; i < 1000; i++) {
            double equation = Math.pow(-2, i) / (iFactorial(i) * (i + 1));
            if (Math.abs(equation) >= E) {
                sum += equation;
            } else {
                break;
            }
        }
        return sum;
    }

    void outputResults(double E, double result) {
        System.out.println("E=" + E + "\nsum of series = " + result);
    }

    public static void main(String[] args) {
        lab3_task14 numeration = new lab3_task14();
        try (Scanner in = new Scanner(System.in)) {
            try {
                System.out.print("Set the accuracy E:");
                double E = in.nextDouble();
                if (E > 0) {
                    double result = numeration.equationOfSum(E);
                    numeration.outputResults(E, result);
                } else {
                    throw new IllegalArgumentException("E must be greater than 0");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}