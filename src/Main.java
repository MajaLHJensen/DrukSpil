import processing.core.*;

public class Main extends PApplet{

    public void setup()
    {
        background(80,69,38);
    }

    public void draw()
    {
        Graphics g = new Graphics();
        g.processingTool = this;
        g.game();
    }
    public void settings()
    {
        size(600,600);
    }


    public static void main(String[] args)
    {
        String[] appletArgs = new String[]{"Main"};
        if (args != null) {
            PApplet.main(concat(appletArgs, args));
        } else
        {
            PApplet.main(appletArgs);

        }

        /*
        // Here we call the method to welcome the player and log in or create an account.
        TextUI textUI = new TextUI();
        textUI.startGame();

        //Here we call the method where the player choose their drink of choice and playing status
        textUI.chooseDrinkOption();
        textUI.playerStatus();
         */

    }

    /*
        // The method that calls the main() method, is used to restart in method startGame()
        static void mainCaller(){
            count++;
            if (count < 3) {
                main(null);
            }
    }
     */

}