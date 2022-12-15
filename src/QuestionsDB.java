import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;

public class QuestionsDB implements IConnect {
    private Connection connection;
    String url = "jdbc:mysql://127.0.0.1:3306/?user=root" + "autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "1692";
     ArrayList<Questions> questionsData = new ArrayList<>();

    public ArrayList<Questions> getAllQuestions() throws SQLException {
        establishConnection();
        String query = "SELECT * FROM question.mytable ORDER BY rand()";
        Statement statement = this.connection.createStatement();
        statement.execute(query);
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            String questionsID = resultSet.getString("QuestionID");
            String question = resultSet.getString("Questions");
            Questions questions = new Questions(questionsID, question);
            questionsData.add(questions);
        }
        return questionsData;
    }

    private void establishConnection() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void pickRandomQuestion() {
        //This works to find a random question in our arrayList and remove it after being used
        int random = (int)(Math.random() * (questionsData.size()-1) +1);
        Questions askQuestion = questionsData.get(random);
        System.out.println(askQuestion);
        questionsData.remove(askQuestion);
    }
}