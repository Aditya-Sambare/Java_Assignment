package DatabaseOperations;

import DatabaseConnection.ProvideConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordUpdation {
public static int updateRecord(int id,String password,String name,String address,int age){
    Connection connection = ProvideConnection.getConnection();
    int resultSet = 0;
    try {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE employee1 SET password = ?, name = ?, address = ?, age = ? WHERE id = ?");
        preparedStatement.setString(1,password);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,address);
        preparedStatement.setInt(4,age);
        preparedStatement.setInt(5,id);
        resultSet = preparedStatement.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return resultSet;
}
}
