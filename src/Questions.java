public class Questions extends QuestionsDB{
    private final String questionID;
    private final String question;
    public Questions(String questionsID, String question) {
        this.questionID = questionsID;
        this.question = question;
    }

    @Override
    public String toString()
    {
        return "Question: " + questionID +
                " " + question;
    }
}