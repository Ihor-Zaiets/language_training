public class Phrase {
    private String phraseToLearn;
    private String correctAnswer;
    private int correctAnswersInARow;

    public Phrase() {
    }

    public Phrase(String phraseToLearn, String correctAnswer) {
        this.phraseToLearn = phraseToLearn;
        this.correctAnswer = correctAnswer;
        this.correctAnswersInARow = 0;
    }

    public String getPhraseToLearn() {
        return phraseToLearn;
    }

    public void setPhraseToLearn(String phraseToLearn) {
        this.phraseToLearn = phraseToLearn;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
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
