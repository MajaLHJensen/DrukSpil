import java.util.ArrayList;

public class Player {
    private String name;
    private int password;
    private int age;

    public Player(String name, int password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "You are now logged in as: "  + name;
    }


}
