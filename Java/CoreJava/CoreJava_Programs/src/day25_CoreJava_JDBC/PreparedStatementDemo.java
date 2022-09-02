package day25_CoreJava_JDBC;

import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet resultSet;
        int rs;
        PreparedStatement preparedStatement;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_Demo","root","Moofie@2901");
            preparedStatement = connection.prepareStatement("insert into teacher1(name,designation) values(?,?)");
            preparedStatement.setString(1,"aarti");
            preparedStatement.setString(2,"java teacher");
            rs = preparedStatement.executeUpdate();
            preparedStatement.setString(1,"anirudh");
            preparedStatement.setString(2,"react teacher");
            rs = preparedStatement.executeUpdate();
            preparedStatement.setString(1,"mahesh");
            preparedStatement.setString(2,".net teacher");
            rs = preparedStatement.executeUpdate();
            preparedStatement.setString(1,"dhanashri");
            preparedStatement.setString(2,"python teacher");
            rs = preparedStatement.executeUpdate();
            resultSet = preparedStatement.executeQuery("select * from teacher1");
            while(resultSet.next()){
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
            }
            preparedStatement = connection.prepareStatement("UPDATE teacher1 SET name = 'aarti mam' WHERE id=?");
            preparedStatement.setInt(1,1);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("delete from teacher1 where id = ?");
            preparedStatement.setInt(1,4);
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.executeQuery("select * from teacher1");
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
