package gradingSystem.dao;

import gradingSystem.Student;
import gradingSystem.configuration.DatabaseConfiguration;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class StudentDao {
    public void insertStudent(List<Student> student) {

    }

    public void getStudent() {
        Statement stmt;
        try {
            Connection conn = DatabaseConfiguration.getConnection();

            String selectQuery = "SELECT * FROM Student";

            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ID"));
                System.out.println(resultSet.getString("NAME"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
