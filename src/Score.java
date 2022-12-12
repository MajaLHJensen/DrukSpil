import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Score {
    protected final Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> score = new ArrayList<>();
    int highScore = 0;

    public void savePoint() throws IOException {
    ///Display question and press 1 if the person took a drink and press 2 if the person passed.
    // and save it on a file
    String playerAnswer = scanner.nextLine();
    if ("1".equals(playerAnswer)) {
        playerAnswer = String.valueOf(true);
        int highScore =+1;
        score.add(1);
        System.out.println("Yay! You took a drink and got a point!");
        System.out.println("Your score is now: " + highScore);

            FileWriter fw = new FileWriter("highScore.CSV", true);
            fw.write(playerAnswer);
            fw.close();
    }
    if ("2". equals(playerAnswer)){
        System.out.println("Booo! You passed a drink and missed a point!");
        System.out.println("Your score is still: " + highScore);
    }
    else {
        System.out.println("Sorry your finger must have slipped, maybe you had had enough...");
        savePoint();
        }
    System.out.println("display next question");
    }

    //bruges til at display score til sidst
public void printScore() {
    Player player = new Player();
    System.out.println("Here is your highScore" + player.getName() + score);



    }
}