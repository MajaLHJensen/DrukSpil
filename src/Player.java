public class Player {
    private String name;
    private int password;

    public Player(String name, int password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "You are now logged in as: "  + name;
    }
}