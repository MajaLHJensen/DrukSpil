import processing.core.PApplet;
import processing.core.PFont;

public class Graphics
{
    //String saved = "";
    //String typing = "";

    //PFont font = processingTool.createFont("Arial", 16);
    PApplet processingTool;

    //empty constructor
    public Graphics()
    {

    }

    public void game()
    {
        // s for start
        if((processingTool.keyPressed) && (processingTool.key == 's'))
        {
            processingTool.background(80,69,38);
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
            processingTool.background(80,69,38);
            processingTool.textSize(35);
            processingTool.fill(0,0,0);
            processingTool.text("Login - press a", 30,120);
            processingTool.text("Sign up - press b", 30,200);
        }

        // a for login
        if(/* (processingTool.keyPressed) && */(processingTool.key == 'a'))
        {
            processingTool.background(80,69,38);
            processingTool.textSize(20);
            processingTool.fill(0,0,0);
            processingTool.text("Please write username: ", 50,120);
            processingTool.text("Please write password: ", 50,160);
        }

        // b for signUp
        if((processingTool.keyPressed) && (processingTool.key == 'b'))
        {
            processingTool.background(80,69,38);
            processingTool.textSize(20);
            processingTool.fill(0,0,0);
            processingTool.text("Please sign up her", 50,120);
        }

        // 1 for question 1
        if((processingTool.keyPressed) && (processingTool.key == '1'))
        {
            processingTool.background(80,69,38);
            processingTool.textSize(30);
            makePaper();
            drinkAndPass();
            processingTool.fill(0,0,0);
            processingTool.text("Question 1", 120,120);
            processingTool.text("Have you ever...", 120,210);
        }
    }

    public void makePaper()
    {
        processingTool.noStroke();
        processingTool.fill(234,207,152);
        processingTool.rect(100,50,400,500);
        processingTool.fill(80,69,38);
        processingTool.triangle(400,50,400,80,430,50);
        processingTool.triangle(150,50,150,60,180,50);
        processingTool.triangle(250,515,200,550,230,550);
    }

    void drinkAndPass()
    {
        processingTool.stroke(0);
        processingTool.fill(234,207,152);
        processingTool.rect(130,450,90,50);
        processingTool.rect(380,450,90,50);
        processingTool.fill(0,0,0);
        processingTool.text("Pass", 145,485);
        processingTool.text("Drink", 390,485);
    }

    /*
    public void presTheKey()
    {
        if(processingTool.key == '\n')
        {
            saved = typing;
            typing = "";
        }else{
            typing = typing + processingTool.key;
        }
    }
     */
}