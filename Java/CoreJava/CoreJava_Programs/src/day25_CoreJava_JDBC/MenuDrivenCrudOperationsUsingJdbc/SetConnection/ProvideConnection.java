package day25_CoreJava_JDBC.MenuDrivenCrudOperationsUsingJdbc.SetConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProvideConnection implements ConnectionsDetails{
    static Connection connection = null;

    public ProvideConnection() {}
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url,userName,password);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
