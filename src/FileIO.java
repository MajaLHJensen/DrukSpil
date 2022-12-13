import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    protected final Scanner scanner = new Scanner(System.in);
    ArrayList<Player> players = new ArrayList<>();
    File file = new File("data/UserLogin.csv");

    boolean checkUser(String name,int password) {
        // Here we check if the user is already registered on UserLogin.csv when they are trying to login
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
            }
        } catch (FileNotFoundException e){
            System.out.println("UserLogin.csv does not exist");
            System.out.println("No users found, please register:");
            String newName = scanner.nextLine();
            int newPassword = scanner.nextInt();
            register(newName, newPassword);
            e.printStackTrace();
        }
        scanner.close();
        return false;
    }

    boolean checkUserSignUp(String newName){
        // Here we check if the user is already registered on UserLogin.csv when they are trying to create a new account
        try{
            File file = new File("data/UserLogin.csv");
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

    void register(String newName, int newPassword) {
        //Here we transfer the new login to the file(UserLogin.csv) when the user signs up.
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
            Player player = new Player(newName, newPassword);
            players.add(player);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}




