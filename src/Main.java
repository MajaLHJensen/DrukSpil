import java.util.Scanner;

public class Main{
    static int count = 0;

    public static void main(String[] args)
    {
        // Here we call the method to welcome the player and log in or create an account.
        TextUI textUI = new TextUI();
        textUI.startGame();
        textUI.gameSettup();
    }

        // The method that calls the main() method, is used to restart in method startGame()
        static void mainCaller(){
            count++;
            if (count < 3) {
                main(null);
            }
    }
}