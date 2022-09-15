package DatabaseOperations;

import DatabaseConnection.ProvideConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecordDeletion {
    public static int deleteRecord(int id){
        Connection connection = ProvideConnection.getConnection();
        int resultSet = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from employee1 where id = ?");
       preparedStatement.setInt(1,id);
       resultSet = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
