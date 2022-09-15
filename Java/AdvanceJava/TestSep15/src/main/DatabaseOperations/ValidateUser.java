package DatabaseOperations;

import DatabaseConnection.ProvideConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateUser {
    public static ResultSet validateUserAndDisplay(String name,String password){
        Connection connection = ProvideConnection.getConnection();
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee1 where name=? and password = ?");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,password);
        resultSet = preparedStatement.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }
}
