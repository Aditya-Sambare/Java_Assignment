package day25_CoreJava_JDBC;

import java.sql.*;

public class StatementDemo {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet resultSet;
        int rs;
        Statement statement;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_Demo","root","Moofie@2901");
            statement = connection.createStatement();
//            rs = statement.executeUpdate("insert into teacher(name,designation) values('aarti','java teacher')");
//            rs = statement.executeUpdate("insert into teacher(name,designation) values('anirudha','react teacher')");
//            rs = statement.executeUpdate("insert into teacher(name,designation) values('mahesh','c sharp teacher')");
//            rs = statement.executeUpdate("insert into teacher(name,designation) values('saurabh','python teacher')");
            resultSet = statement.executeQuery("select * from teacher");
            while(resultSet.next()){
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
            }
            rs = statement.executeUpdate("UPDATE teacher SET name = 'aarti mam' WHERE id=1");
            rs = statement.executeUpdate("delete from teacher where id = 4");
            resultSet = statement.executeQuery("select * from teacher");
            while(resultSet.next()){
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
