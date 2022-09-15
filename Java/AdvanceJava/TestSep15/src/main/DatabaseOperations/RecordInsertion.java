package DatabaseOperations;

import DatabaseConnection.ProvideConnection;
import EmployeeDao.EmployeePojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//EmployeePojo employeePojo = new EmployeePojo(id,password,name,address,age);
public class RecordInsertion {
    public static int insertRecord(EmployeePojo employeePojo){
        Connection connection = ProvideConnection.getConnection();
        int resultSet = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employee1 values(?,?,?,?,?)");
            preparedStatement.setInt(1,employeePojo.getId());
            preparedStatement.setString(2,employeePojo.getPassword());
            preparedStatement.setString(3,employeePojo.getName());
            preparedStatement.setString(4,employeePojo.getAddress());
            preparedStatement.setInt(5,employeePojo.getAge());
            resultSet = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
