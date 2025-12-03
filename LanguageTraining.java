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
        phrases.addAll(LearningData.getPronounsWithVerbToBe());
        phrases.addAll(LearningData.getPronounsWithVerbToHave());

        while (!phrases.isEmpty()) {
            Phrase phrase = phrases.get(new Random().nextInt(phrases.size()));
            System.out.printf("Phrase: %s\n", phrase.getPhraseToLearn());
            System.out.print("Write number name: ");
            String answer = scanner.nextLine();
            if (phrase.getCorrectAnswer().equals(answer.toLowerCase())) {
                phrase.setCorrectAnswersInARow(phrase.getCorrectAnswersInARow() + 1);
                if (phrase.getCorrectAnswersInARow() == 3) {
                    phrases.remove(phrase);
                    System.out.printf("Correct answers in a row: %d\n", phrase.getCorrectAnswersInARow());
                    System.out.println("Removing phrase from phrase pull.\n");
                    continue;
                }
                System.out.println("Correct.");
                System.out.printf("Correct answers in a row: %d\n\n", phrase.getCorrectAnswersInARow());
            } else {
                phrase.setCorrectAnswersInARow(0);
                weakPhrase.add(phrase);
                System.out.printf("Wrong. Correct answer: %s\n\n", phrase.getCorrectAnswer());
            }
        }
        System.out.println("Well done.");
        System.out.println("Weak phrases:");
        weakPhrase.sort(Comparator.comparing(Phrase::getPhraseToLearn));
        System.out.println(weakPhrase);
    }
}
