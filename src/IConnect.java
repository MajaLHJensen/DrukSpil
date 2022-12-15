import java.sql.SQLException;
import java.util.ArrayList;

public interface IConnect {
    ArrayList<Questions> getAllQuestions() throws SQLException;
}
