import java.io.IOException;
import java.sql.SQLException;

public class Main {

    static int count = 0;
    public static void main(String[] args) throws IOException, SQLException {

        // Here we call the method to welcome the player and log in or create an account.
        TextUI textUI = new TextUI();
        textUI.startGame();
        textUI.clearConsole();
        textUI.gameSetup();

        boolean done = false;
        while(!done)
        {
            //Here we call the method to start the game
            textUI.clearConsole();
            QuestionsDB questionsDB = new QuestionsDB();
            textUI.gameQuestions();

            // Here we call the method to generate a random computer player
            ComputerPlayer computerPlayer = new ComputerPlayer();
            computerPlayer.printRandomQuestion();

            // here we call the method to display the end screen
            Score score = new Score();
            score.endGameScore();

            if (questionsDB.questionsData.size() == 0)  {
                done= true;
            }
        }
    }


    // The method that calls the main() method, is used to restart in method startStreaming()
    static void mainCaller() throws SQLException, IOException
    {
        count++;
        // Calling the main() only 3 times
        if (count < 3) {
            // Calling the main() method
            main(null);
        }
    }

}