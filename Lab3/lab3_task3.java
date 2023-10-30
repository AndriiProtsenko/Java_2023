import java.util.Scanner;
public class lab3_task3 {
    public double equationOfSum(double z, int k) {
        double sum = 0;
        if (k <= 15) {
            for (int i = 1; i <= k; i++) {
                double equation = ((1 / Math.sqrt(z * i)) + Math.tan(k / i));
                sum += equation;
            }


        }
        return sum;

    }


    void outputResults(double z, int k, double result) {
        if (result != 0) {
            System.out.println("z=" + z + ";\nk=" + k + ";\nvalue sum of series=" + result + ";");
        }

        if (result == 0) {
            System.out.print(" Warning value k >=15");
        }
    }

    public static void main(String[] args) {
        lab3_task3 numeration = new lab3_task3();
        try (Scanner in = new Scanner(System.in)) {
            try {
                System.out.print("Please specify a variable z:");
                double z = in.nextDouble();
                System.out.print("Please specify a value k:");
                int k = in.nextInt();
                double result = numeration.equationOfSum(z, k);
                numeration.outputResults(z, k, result);
            } catch (Exception e) {
                System.out.print("IllegalArgumentExceptio");
            }
        }

    }
}