import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FrenchNumbersTraining {
    public static void main(String[] args) {
        // 1. number
        // 2. string name
        // 3. correct numbers in a row
        // 4. remove from number pull after 3 in a row
        Scanner scanner = new Scanner(System.in);
        List<Number> numbers = getNumbersFrom1To10();

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
                }
                System.out.println("Correct.");
                System.out.printf("Correct answers in a row: %d\n\n", number.getCorrectAnswersInARow());
            } else {
                number.setCorrectAnswersInARow(0);
                System.out.printf("Wrong. Correct answer: %s\n\n", number.getStringName());
            }
        }
        System.out.println("Well done.");
    }

    public static List<Number> getNumbersFrom1To10() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(new Number(1, "un"));
        numbers.add(new Number(2, "deux"));
        numbers.add(new Number(3, "trois"));
        numbers.add(new Number(4, "quatre"));
        numbers.add(new Number(5, "cinq"));
        numbers.add(new Number(6, "six"));
        numbers.add(new Number(7, "sept"));
        numbers.add(new Number(8, "huit"));
        numbers.add(new Number(9, "neuf"));
        numbers.add(new Number(10, "dix"));
        return numbers;
    }
}
