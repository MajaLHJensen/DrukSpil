import java.util.Scanner;

public class TextUI {
    protected final Scanner scanner = new Scanner(System.in);
    protected final FileIO fileIO = new FileIO();

    public void startGame() {
        System.out.println("Welcome to No Friends Allowed - A drinking game for lonely people");
        System.out.println("Press ENTER to login or sign up");
        scanner.nextLine();

        System.out.println("Do you want to create a new account or login to an already existing account?");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to create a new account");
        String name = "";
        String newName = "";
        String answerForAge = "";
        while (true) {
            String answer = scanner.nextLine();
            if ("1".equals(answer)) {
                System.out.println('\n' + "Name: ");
                name = scanner.nextLine();
                System.out.println('\n' + "Password: ");
                int password = scanner.nextInt();
                System.out.println("Are you 18+ ? press y for yes, press n for no");
                answerForAge = scanner.nextLine();
                if ("Y".equals(answerForAge)) {
                    System.out.println("");
                    if ("N".equals(answerForAge)) {
                        System.out.println("You are too young baby boy. Please try again. ");
                        startGame();
                    }

                    if (fileIO.checkUser(name, password, answerForAge)) {
                        System.out.println('\n' + " Welcome back to No Friends Allowed" + name);
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Incorrect username or password. Please try again.");
                        startGame();
                    }
                }

                if ("2".equals(answer)) {
                    System.out.println("Please create a username with only letters: ");
                    newName = scanner.nextLine();
                    System.out.println("Please create a password with only numbers: ");
                    int newPassword = scanner.nextInt();
                    System.out.println("Are you 18+ ? press y for yes, press n for no");
                    answerForAge = scanner.nextLine();
                    if ("Y".equals(answerForAge)) {
                        System.out.println("");
                        if ("N".equals(answerForAge)) {
                            System.out.println("You are too young baby boy. Please try again. ");
                            startGame();
                        }

                        if (fileIO.checkUserSignUp(newName)) {
                            fileIO.register(newName, newPassword, answerForAge);
                            scanner.nextLine();
                            System.out.println("Welcome " + newName);
                            System.out.println("Please press ENTER to continue");
                            scanner.nextLine();
                            break;
                        } else {
                            System.out.println(" ");
                            System.out.println("Username does already exist, please login or change username");
                            System.out.println(" ");
                            scanner.nextLine();
                            Main.mainCaller();
                        }
                        System.out.println("Welcome to No Friends Allowed " + newName);
                        System.out.println("Please press ENTER to continue");
                        scanner.nextLine();
                        break;
                    }
                }
            }
        }
    }
        public void gameSettup () {
            System.out.println("Do you want to drink by your self or with other people?");
            System.out.println("1 - I choose to drink with others");
            System.out.println("2 - I choose to drink alone");
            int pickStatus = scanner.nextInt();
            if (1 == pickStatus) {
                System.out.println("You are now ready to drink with potential new friend");
            } else if (2 == pickStatus) {
                System.out.println('\n' + "You are now ready to drink all by your self");
            } else {
                System.out.println("Option does sadly not exist, please try again");
            }
            Main.mainCaller();


            System.out.println('\n' + "Please choose if you want to drink alcohol or non-alcohol during the game");
            System.out.println("1 - I choose alcohol");
            System.out.println("2 - I choose non-alcohol");
            int input = scanner.nextInt();
            if ((input == 1) && (1 == pickStatus)) {
                System.out.println("You have chosen to drink alcohol during the game");
                System.out.println("Starting game with alcohol and friends");
            } else {
                System.out.println("Starting game with alcohol and NO friends");
            }

            if ((input == 2) && (2 == pickStatus)) {
                System.out.println("You have chosen not to drink alcohol during the game");
                System.out.println("Starting game with non-alcohol and friends");
            } else {
                System.out.println("Starting game with non-alcohol and NO friends");
            }
        }

}



