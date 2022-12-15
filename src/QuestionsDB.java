import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;

public class QuestionsDB {
    private Connection connection;
    String url = "jdbc:mysql://127.0.0.1:3306/?user=root" + "autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "1692";
    static ArrayList<Questions> questionsData = new ArrayList<>();

    public static ArrayList<Questions> getQuestionsData()
    {
        return questionsData;
    }

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
            //System.out.println(questions);
        }
        return questionsData;
    }

    private void establishConnection() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void pickRandomQuestion() {
        //This works to find a random question in our arrayList.
        int random = (int)(Math.random() * (questionsData.size()-1) +1);
            Questions askQuestion = questionsData.get(random);
            System.out.println(askQuestion);
            questionsData.remove(askQuestion);

        //Need to make sure that a question that already has been printed, is not printed again.
        //We use the set method so that it will only put the question out one time. Set will not dublicate.
    }
}