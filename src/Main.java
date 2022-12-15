import java.io.IOException;
import java.sql.SQLException;

public class Main{
    static int count = 0;

    public static void main(String[] args) throws IOException, SQLException {

        //Start the music!
        InputsSound.RunMusic("SoundTrack/music.wav");

        // Here we call the method to welcome the player and log in or create an account.
        TextUI textUI = new TextUI();
        textUI.startGame();
        textUI.clearConsole();
        textUI.gameSetup();

        boolean done = false;
        while(!done) {
            //Here we call the method to start the game
            QuestionsDB questionsDB = new QuestionsDB();
            textUI.gameQuestions();

            //Here we call the method to generate a random computer player
            ComputerPlayer computerPlayer = new ComputerPlayer();
            computerPlayer.printRandomQuestion();

            //Here we call the method to display the end screen
            Score score = new Score();
            score.endGameScore();

            //Here we iterate over the array to se if there is any questions left or else end the game.
            if (questionsDB.questionsData.size() == 0) {
                done = true;
            }
        }
    }

    //The method that calls the main() method, is used as an option to quit the game
    static void mainCaller() throws SQLException, IOException {
        count++;
        // Calling the main() only 3 times
        if (count < 3) {
            // Calling the main() method
            main(null);
        }
    }
}