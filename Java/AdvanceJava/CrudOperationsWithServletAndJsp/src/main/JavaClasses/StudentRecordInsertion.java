package JavaClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRecordInsertion {
    public static int insertStudentsRecord(int id, String name, int age){
        int resultset = 0;
        Connection connection = ConnectionProviderDao.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into students_data values(?,?,?)");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,age);
            resultset = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultset;
    }
}
