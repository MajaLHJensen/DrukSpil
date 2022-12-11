import processing.core.PApplet;

public class Graphics
{
    PApplet processingTool;
    //PFont f = processingTool.createFont("Arial", 16);
    //String typing = "";


    //empty constructor
    public Graphics()
    {


    }

    public void game()
    {
        // s for start
        if((processingTool.keyPressed) && (processingTool.key == 's'))
        {
            processingTool.background(0,115,0);
            processingTool.textSize(40);
            processingTool.fill(0,0,0);
            processingTool.text("Welcome to ", 30,120);
            processingTool.textSize(60);
            processingTool.fill(0,0,0);
            processingTool.text("NO FRIENDS ALLOWED", 20,250);

        }

        // o for option
        if((processingTool.keyPressed) && (processingTool.key == 'o'))
        {
            processingTool.background(0,115,0);
            processingTool.textSize(35);
            processingTool.fill(0,0,0);
            processingTool.text("Login - press a", 30,120);
            processingTool.text("Sign up - press b", 30,200);
        }

        // a for login
        if((processingTool.keyPressed) && (processingTool.key == 'a'))
        {
            processingTool.background(0,115,0);
            processingTool.textSize(20);
            processingTool.fill(0,0,0);
            processingTool.text("Please write username: ", 50,120);
            processingTool.text("Please write password: ", 50,160);
        }

        // b for signUp
        if((processingTool.keyPressed) && (processingTool.key == 'b'))
        {
            processingTool.background(0,115,0);
            processingTool.textSize(20);
            processingTool.fill(0,0,0);
            processingTool.text("Please sign up her", 50,120);
        }


        // 1 for question 1
        if((processingTool.keyPressed) && (processingTool.key == '1'))
        {
            processingTool.background(0,115,0);
            processingTool.textSize(30);
            processingTool.fill(0,0,0);
            processingTool.text("Have you ever...", 50,120);
        }

    }


}
