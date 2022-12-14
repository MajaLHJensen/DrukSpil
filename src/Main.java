import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException, SQLException
    {

            // Here we call the method to welcome the player and log in or create an account.
            TextUI textUI = new TextUI();
            textUI.startGame();
            textUI.clearConsole();
            textUI.gameSetup();

            //Here we call the method to start the game
            textUI.clearConsole();
            QuestionsDB questionsDB = new QuestionsDB();
            questionsDB.getAllQuestions();
            // Here we call the method to save the players points and display them


            // Here we call the method to generate a random computer player
            ComputerPlayer computerPlayer = new ComputerPlayer();
            computerPlayer.printRandomQuestion();

            // here we call the method to display the end screen
           // score.endGameScore();
        }


    }
