public class Number {
    private int numericValue;
    private String stringName;
    private int correctAnswersInARow;

    public Number() {
    }

    public Number(int numericValue, String stringName) {
        this.numericValue = numericValue;
        this.stringName = stringName;
        this.correctAnswersInARow = 0;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }

    public String getStringName() {
        return stringName;
    }

    public void setStringName(String stringName) {
        this.stringName = stringName;
    }

    public int getCorrectAnswersInARow() {
        return correctAnswersInARow;
    }

    public void setCorrectAnswersInARow(int correctAnswersInARow) {
        this.correctAnswersInARow = correctAnswersInARow;
    }

    @Override
    public String toString() {
        return String.valueOf(numericValue);
    }
}
