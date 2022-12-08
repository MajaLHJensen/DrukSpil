public class Player {
    private String name;
    private int password;
    private boolean isOver18;

    public Player(String name, int password, boolean isOver18) {
        this.name = name;
        this.password = password;
        this.isOver18 = isOver18;
    }


    @Override
    public String toString() {
        return "You are now logged in as: "  + name;
    }
}
