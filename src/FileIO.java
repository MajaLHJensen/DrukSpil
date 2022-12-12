import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    protected final Scanner scanner = new Scanner(System.in);

    ArrayList<Player> players = new ArrayList<>();

    File file = new File("");
    boolean checkUser(String name,int password, int age) {
        // Here we check user is already registered on UserLogin.csv when they are trying to login
        try{
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] user = line.split(", ");
                String userNameFromFile = user[0];
                int passwordFromFile = Integer.parseInt(user[1]);

                if (name.equals(userNameFromFile))
                    if (password == passwordFromFile)
                        return true;
                System.out.println(name);
                System.out.println("Username does exist");
            }
        }catch (FileNotFoundException e){
            System.out.println("UserLogin.csv does not exist");
            System.out.println("No users found, please register:");
            String newName = scanner.nextLine();
            int newPassword = scanner.nextInt();
            int setAge = scanner.nextInt();
            register(newName, newPassword, setAge);
            e.printStackTrace();
        }
        scanner.close();
        return false;
    }

    boolean checkUserSignUp(String newName){
        // check user is already registered on UserLogin.csv when they are trying to create a new account
        try{
            File file = new File("");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] user = line.split(", ");
                String userNameFromFile = user[0];

                if (newName.equals(userNameFromFile))
                    return false;
            }
        }catch (FileNotFoundException e){
            System.out.println("UserLogin.csv does not exist");
            e.printStackTrace();
        }
        return true;
    }

    void register(String newName, int newPassword, int setAge) {
        //Transfer new login to the file(UserLogin.csv) when the user signs up.
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            String userLogin = newName + ", " + newPassword;
            bw.write(userLogin);
            bw.close();
            Player player = new Player(newName, newPassword, setAge);
            players.add(player);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}




