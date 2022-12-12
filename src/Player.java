public class Player {
    private String name;
    private int password;
    private int age;

    public Player(String name, int password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "You are now logged in as: "  + name;
    }
}
