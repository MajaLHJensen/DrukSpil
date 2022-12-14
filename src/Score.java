import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Score {
    protected final Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> score = new ArrayList<>();

    public void savePoint() throws IOException {
    ///Display question and press 1 if the person took a drink and press 2 if the person passed.
        while (true) {
            String playerAnswer = scanner.nextLine();
            if ("1".equals(playerAnswer)) {
                int point = 1;
                score.add(point);
                System.out.println("Yay! You took a drink and got a point!");
                System.out.println("Your score is now: " + score);
                break;
            }
            if ("2".equals(playerAnswer)) {
                System.out.println("Booo! You passed a drink and missed a point!");
                System.out.println("Your score is still: " + score);
                break;
            } else {
                System.out.println("Sorry your finger must have slipped, maybe you had had enough...");
                scanner.nextLine();
                savePoint();
            }
        }
    // set næste spørgsmål ind og computeren tur
    }

    //bruges til at display score til sidst
    public void endGameScore() {
        Player player = new Player();
        System.out.println("Your are hopefully pissed and ready for a fun night alone or with friends");
        System.out.println("Here is your highScore" + player.getName() + player.getScore());
        System.out.println("Thank you for playing!!");
    }
}