public class Phrase {
    private String phraseToLearn;
    private String stringName;
    private int correctAnswersInARow;

    public Phrase() {
    }

    public Phrase(String phraseToLearn, String stringName) {
        this.phraseToLearn = phraseToLearn;
        this.stringName = stringName;
        this.correctAnswersInARow = 0;
    }

    public String getPhraseToLearn() {
        return phraseToLearn;
    }

    public void setPhraseToLearn(String phraseToLearn) {
        this.phraseToLearn = phraseToLearn;
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
        return String.valueOf(phraseToLearn);
    }
}
