import java.util.Scanner;

public class TextUI {
    protected final Scanner scanner = new Scanner(System.in);
    protected final FileIO fileIO = new FileIO();

    public void startGame() {
        System.out.println("Welcome to NO FRIENDS ALLOWED - A drinking game for lonely people");
        System.out.println("Press ENTER to login or sign up");
        scanner.nextLine();

        System.out.println("Do you want to create a new account or login to an already existing account?");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to create a new account");
        String name = "";
        String newName = "";

        // Method to login to an already existing account, that checks the csv file to see if the user is on there
        while (true) {
            String answer = scanner.nextLine();
            if ("1".equals(answer)) {
                System.out.println('\n' + "Name: ");
                name = scanner.nextLine();
                System.out.println('\n' + "Password: ");
                int password = scanner.nextInt();

                if (fileIO.checkUser(name, password)) {
                    System.out.println('\n' + " Welcome back to No Friends Allowed " + name);
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Incorrect username or password. Please try again.");
                    startGame();
                }
            }
            //Method to create a new account, that checks to se if the username is already taken and saves the new user on the csv file
            if ("2".equals(answer)) {
                System.out.println("Please create a username with only letters: ");
                newName = scanner.nextLine();
                System.out.println("Please create a password with only numbers: ");
                int newPassword = scanner.nextInt();
                if (fileIO.checkUserSignUp(newName)) {
                    fileIO.register(newName, newPassword);
                    scanner.nextLine();
                    System.out.println("Welcome " + newName);
                    System.out.println("Please press ENTER to continue");
                    scanner.nextLine();
                    break;
                }else {
                    System.out.println("Username does already exist, please login or change username");
                    scanner.nextLine();
                    startGame();
                }
                System.out.println("Welcome to No Friends Allowed " + newName);
                System.out.println("Please press ENTER to continue");
                scanner.nextLine();
                break;
            }
        }
    }

    public void gameSettup () {
        System.out.println("Do you want to drink by your self or with other people?");
        System.out.println("1 - I choose to drink with others");
        System.out.println("2 - I choose to drink alone");
        int pickStatus = scanner.nextInt();
        // Here we save the users answer whether they are playing alone or not
        if (1 == pickStatus) {
            System.out.println("You are now ready to drink with potential new friend");
        }
        if (2 == pickStatus) {
            System.out.println('\n' + "You are now ready to drink all by your self");
        } else {
            System.out.println("Option does sadly not exist, please try again");
            gameSettup();
        }
        // If the method isOver18 is true we continue to the alcohol question and compare it to pickStatus
        // if it is false it starts the game without alcohol.
        if(isOver18()) {
            System.out.println("Please choose if you want to drink alcohol or non-alcohol during the game");
            System.out.println("1 - I choose alcohol");
            System.out.println("2 - I choose non-alcohol");
            int input = scanner.nextInt();

            if ((input == 1) && (1 == pickStatus)) {
                System.out.println("You have chosen to drink alcohol during the game");
                System.out.println("Starting game with alcohol and friends");
            }
            if((input ==1) && (2 == pickStatus)) {
                System.out.println("Starting game with alcohol and NO friends");
            }
            if ((input == 2) && (2 == pickStatus)) {
                System.out.println("You have chosen not to drink alcohol during the game");
                System.out.println("Starting game with non-alcohol and friends");
            }
            if((input == 2) && (1 == pickStatus)){
                System.out.println("Starting game with non-alcohol and NO friends");
            }
        }
    }
        public boolean isOver18() {
            System.out.println("Please enter your age");
            int answerForAge = scanner.nextInt();
            if (answerForAge >=18) {
                System.out.println("you are: " + answerForAge );
                return true;
            } else {
                System.out.println("you are: " + answerForAge + "Age restricted game is starting. Go get your juice box big boy");
            } return false;
        }
}



