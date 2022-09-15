package DatabaseOperations;

import DatabaseConnection.ProvideConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FetchingRecords {
    public static ResultSet fetchRecords(){
        Connection connection = ProvideConnection.getConnection();
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee1");
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
return resultSet;
    }
}
