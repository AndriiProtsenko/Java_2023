public class lab6_task6 {
    public static void main(String[] args) {
        String octalString = "10"; // 20 - 16, 377 - 255
        int decimalNumber = octStringToInt(octalString);
        System.out.println("Значення String: " + octalString);
        System.out.println("Значення int: " + decimalNumber);
    }

    public static int octStringToInt(String s) {
        s = s.toLowerCase(); // Перетворення рядка у нижній регістр (не обов'язково, але робить код більш гнучким)

        int decimalNumber = 0;

        char[] chars = s.toCharArray();
        for (char digit : chars) {
            int octalDigit = Character.getNumericValue(digit);
            if (octalDigit >= 0 && octalDigit <= 7) { // Перевірка, що символ є правильною цифрою вісімкової системи
                decimalNumber = decimalNumber * 8 + octalDigit;
            } else {
                throw new IllegalArgumentException("Вхiдний рядок не є правильним числом у вiсiмковiй системi.");
            }
        }

        return decimalNumber;
    }
}
