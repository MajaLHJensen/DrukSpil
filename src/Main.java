import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Here we call the method to welcome the player and log in or create an account.
       TextUI textUI = new TextUI();
       // textUI.startGame();
        //textUI.gameSetup();
        textUI.gameQuestions();

        //Here we call the method to start the game
        //QuestionsDB questionsDB  = new QuestionsDB();
       // questionsDB.getAllQuestions();

        // Here we call the method to save the players points and display them
       // Score score = new Score();
        //score.savePoint();
    }
}