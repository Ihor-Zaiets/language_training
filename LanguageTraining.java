import java.util.*;

public class LanguageTraining {
    public static void main(String[] args) {
        // 1. number
        // 2. string name
        // 3. correct numbers in a row
        // 4. remove from number pull after 3 in a row
        Scanner scanner = new Scanner(System.in);
        List<Number> weakNumber = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        numbers.addAll(LearningData.getNumbersFrom1To10());
        numbers.addAll(LearningData.getNumbersFrom11To19());
        numbers.addAll(LearningData.getNumbersFrom20To100());

        while (!numbers.isEmpty()) {
            Number number = numbers.get(new Random().nextInt(numbers.size()));
            System.out.printf("Number: %d\n", number.getNumericValue());
            System.out.print("Write number name: ");
            String answer = scanner.nextLine();
            if (number.getStringName().equals(answer.toLowerCase())) {
                number.setCorrectAnswersInARow(number.getCorrectAnswersInARow() + 1);
                if (number.getCorrectAnswersInARow() == 3) {
                    numbers.remove(number);
                    System.out.printf("Correct answers in a row: %d\n", number.getCorrectAnswersInARow());
                    System.out.println("Removing number from number pull.\n");
                    continue;
                }
                System.out.println("Correct.");
                System.out.printf("Correct answers in a row: %d\n\n", number.getCorrectAnswersInARow());
            } else {
                number.setCorrectAnswersInARow(0);
                weakNumber.add(number);
                System.out.printf("Wrong. Correct answer: %s\n\n", number.getStringName());
            }
        }
        System.out.println("Well done.");
        System.out.println("Weak numbers:");
        weakNumber.sort(Comparator.comparingInt(Number::getNumericValue));
        System.out.println(weakNumber);
    }
}
