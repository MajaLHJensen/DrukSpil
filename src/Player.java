import java.util.ArrayList;

public class Player {
    private String name;
    private int password;

    ArrayList<Integer> score = new ArrayList<>();

    public Player(String name, int password) {
        this.name = name;
        this.password = password;
        this.score = score;
    }

    public Player() {
        //TOM
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getScore() {
        return score;
    }

    public void setScore(ArrayList<Integer> score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "You are now logged in as: "  + name + ". Here are your previous highscores: " + score;
    }
}