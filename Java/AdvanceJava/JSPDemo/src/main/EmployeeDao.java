import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
public int registerEmployee(Employee employee) throws ClassNotFoundException {
    String insert_user_sql = "insert into employees (firstname,lastname,username,password,address,contact) values(?,?,?,?,?,?);";
    int result = 0;
    Class.forName("com.mysql.jdbc.Driver");
    try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_Demo","root","Moofie@2901");
        PreparedStatement preparedStatement = connection.prepareStatement(insert_user_sql);
        preparedStatement.setString(1,employee.getFirstName());
        preparedStatement.setString(2,employee.getLastName());
        preparedStatement.setString(3,employee.getUserName());
        preparedStatement.setString(4,employee.getPassword());
        preparedStatement.setString(5, employee.getAddress());
        preparedStatement.setString(6,employee.getContact());
        result = preparedStatement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
}
