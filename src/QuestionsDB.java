import java.sql.*;
import java.util.ArrayList;

public class QuestionsDB {
    private Connection connection;
    String url= "";
    String username = "";
    String password = "";
    ArrayList<Questions>questionsData = new ArrayList<>();

    public ArrayList<Questions> getAllQuestions() {
        establishConnection();
        String query = "SELECT * from questions.mytable;";
        try{
            Statement statement = this.connection.createStatement();
            statement.execute(query);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()){
                String questionsID = resultSet.getString("questionID");
                String question = resultSet.getString("question");
                Questions questions = new Questions(questionsID, question);
                questionsData.add(questions);
                System.out.println(questions);
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("This option does not exist. Please try again.");
        }
        return questionsData;
    }

    private void establishConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
