public class lab3_task6 {
    public static double calculateX(double t, int i) {
        if (i == 1) {
            // Випадок, коли i = 1
            return Math.sqrt(t);
        } else if (i == 2) {
            // Випадок, коли i = 2
            return 1.0 / Math.sqrt(t);
        } else {
            // Випадок, коли i не дорівнює 1 або 2
            double sum = 0;
            for (int k = 1; k <= i; k++) {
                sum += k * t;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        double t = 2.0; // Приклад значення t

        // Результати для i = 1, i = 2, і i = 4
        for (int i : new int[]{1, 2, 4}) {
            double result = calculateX(t, i);
            System.out.println("x(" + i + ") = " + result);
        }
    }
}