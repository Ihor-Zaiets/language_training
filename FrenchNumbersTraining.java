import java.util.*;

public class FrenchNumbersTraining {
    public static void main(String[] args) {
        // 1. number
        // 2. string name
        // 3. correct numbers in a row
        // 4. remove from number pull after 3 in a row
        Scanner scanner = new Scanner(System.in);
        List<Number> weakNumber = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        numbers.addAll(getNumbersFrom1To10());
        numbers.addAll(getNumbersFrom11To19());
        numbers.addAll(getNumbersFrom20To100());

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
    public static List<Number> getNumbersFrom11To19() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(new Number(11, "onze"));
        numbers.add(new Number(12, "douze"));
        numbers.add(new Number(13, "treize"));
        numbers.add(new Number(14, "quatorze"));
        numbers.add(new Number(15, "quinze"));
        numbers.add(new Number(16, "seize"));
        numbers.add(new Number(17, "dix-sept"));
        numbers.add(new Number(18, "dix-huit"));
        numbers.add(new Number(19, "dix-neuf"));
        return numbers;
    }

    public static List<Number> getNumbersFrom20To100() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(new Number(20, "vingt"));
        numbers.add(new Number(30, "trente"));
        numbers.add(new Number(40, "quarante"));
        numbers.add(new Number(50, "cinquante"));
        numbers.add(new Number(60, "soixante"));
        numbers.add(new Number(70, "soixante-dix"));
        numbers.add(new Number(80, "quatre-vingts"));
        numbers.add(new Number(90, "quatre-vingt-dix"));
        numbers.add(new Number(100, "cent"));
        return numbers;
    }
}
