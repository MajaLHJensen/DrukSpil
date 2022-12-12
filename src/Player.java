public class Player {
    private String name;
    private int password;
    private String answerForAge;

    public Player(String name, int password, String answerForAge) {
        this.name = name;
        this.password = password;
        this.answerForAge = answerForAge;
    }

    @Override
    public String toString() {
        return "You are now logged in as: "  + name;
    }
}
