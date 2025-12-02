import java.util.*;

public class LanguageTraining {
    public static void main(String[] args) {
        // 1. number
        // 2. string name
        // 3. correct numbers in a row
        // 4. remove from number pull after 3 in a row
        Scanner scanner = new Scanner(System.in);
        List<Phrase> weakPhrase = new ArrayList<>();
        List<Phrase> phrases = new ArrayList<>();
        phrases.addAll(LearningData.getNumbersFrom1To10());
        phrases.addAll(LearningData.getNumbersFrom11To19());
        phrases.addAll(LearningData.getNumbersFrom20To100());

        while (!phrases.isEmpty()) {
            Phrase phrase = phrases.get(new Random().nextInt(phrases.size()));
            System.out.printf("Number: %d\n", phrase.getNumericValue());
            System.out.print("Write number name: ");
            String answer = scanner.nextLine();
            if (phrase.getStringName().equals(answer.toLowerCase())) {
                phrase.setCorrectAnswersInARow(phrase.getCorrectAnswersInARow() + 1);
                if (phrase.getCorrectAnswersInARow() == 3) {
                    phrases.remove(phrase);
                    System.out.printf("Correct answers in a row: %d\n", phrase.getCorrectAnswersInARow());
                    System.out.println("Removing number from number pull.\n");
                    continue;
                }
                System.out.println("Correct.");
                System.out.printf("Correct answers in a row: %d\n\n", phrase.getCorrectAnswersInARow());
            } else {
                phrase.setCorrectAnswersInARow(0);
                weakPhrase.add(phrase);
                System.out.printf("Wrong. Correct answer: %s\n\n", phrase.getStringName());
            }
        }
        System.out.println("Well done.");
        System.out.println("Weak numbers:");
        weakPhrase.sort(Comparator.comparingInt(Phrase::getNumericValue));
        System.out.println(weakPhrase);
    }
}
