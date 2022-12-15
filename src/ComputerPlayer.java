import java.io.IOException;
import java.sql.SQLException;
public class ComputerPlayer {
    public int getRandomQuestion (int min, int max){
       // Here we pick a random number between 1 and 2
       int range = (max - min) + 1;
       return (int)(Math.random() * range) + min;
    }
    public void printRandomQuestion() throws SQLException, IOException {
        TextUI textUI = new TextUI();
       // if (textUI.pickStatus == 1) {
            System.out.println("\nNow it is your opponents turn, please refrain from drinking during");
            int rand = getRandomQuestion(1, 2);
            System.out.println("\nYour opponent pressed " + rand + " and did what you do when you press " + rand);
            System.out.println("Get ready for your turn! Hope you have enjoyed your break...");
            textUI.gameQuestions();
       // }else if(textUI.pickStatus == 2) {
        //    textUI.gameQuestions();
       // }
    }
}