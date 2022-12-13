import javax.sound.midi.Soundbank;
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
                    Player player = new Player();
                    System.out.println("you " + name + "confirm to be " + player.getAnswerForAge());
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
                            startGame();
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
        public void gameSetup() {
            System.out.println("Do you want to drink by yourself or with random people?");
            System.out.println("1 - I choose to drink with randoms");
            System.out.println("2 - I choose to drink alone");
            int pickStatus = scanner.nextInt();
            if (1 == pickStatus) {
                System.out.println("You are now ready to drink with potential new friend");
            } else if (2 == pickStatus) {
                System.out.println('\n' + "You are now ready to drink all by yourself");
            } else {
                System.out.println("Option does sadly not exist, please try again");
            }
            gameSetup();


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


        //this method is when the user plays the game alone for now
        public void gameQuestions()
        {
            System.out.println('\n' +"When a question appear you must answering it truthfully and follow the instructions");
            System.out.println("When you are ready, push ENTER");
            scanner.nextLine();
            System.out.println("Question 1");
            /* QuestionsDB questionsDB = new QuestionsDB();
            questionsDB.pickRandomQuestion(); */

        }





}



