public class lab6_task9 {
    public static void main(String[] args) {
        String input = "dsfdfs df s3 afa 2d 2 3d fd";
        int count = countLetterNumberCombinations(input);
        System.out.println("Кiлькiсть комбiнацiй лiтер та цифр: " + count);
    }

    public static int countLetterNumberCombinations(String input) {
        String[] words = input.split("\\s+"); // Розділяємо рядок на слова за допомогою пробілів
        int count = 0;

        for (String word : words) {
            if (word.matches(".*[a-zA-Z]+[0-9]+.*") || word.matches(".*[0-9]+[a-zA-Z]+.*")) {
                count++;
            }
        }

        return count;
    }
}
