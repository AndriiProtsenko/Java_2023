public class lab6_task9 {
    public static void main(String[] args) {
        String input = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
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
