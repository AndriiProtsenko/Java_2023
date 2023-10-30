public class lab2 {
    public static void main(String[] args) {
        System.out.println("Task_8: " + calculateTask8(0.345, -2.25, 2.65, 3.99));
        System.out.println("Task_18: " + calculateTask18(2.34, 0.756, 2.23, -1.653));
        System.out.println("Task_28: " + calculateTask28(1.478, 9.26, 0.68, 2.24));
    }

    public static double calculateTask8(double a, double b, double c, double d) {
        double left = (6 * a) / Math.sin(a);
        double right = Math.sqrt(Math.tanh(Math.abs(b * c)) / Math.log(d));
        return left + right;
    }

    public static double calculateTask18(double a, double b, double c, double d) {
        double left = (Math.exp(c) + 2 * Math.log10(a)) / Math.sqrt(Math.pow(c, b));
        double right = Math.abs(Math.asin(d));
        return left * right;
    }

    public static double calculateTask28(double a, double b, double c, double d) {
        double answer = Math.log(Math.abs(b / a)) + Math.sqrt(Math.sinh(c) + Math.exp(d));
        return 2 * answer;
    }
}