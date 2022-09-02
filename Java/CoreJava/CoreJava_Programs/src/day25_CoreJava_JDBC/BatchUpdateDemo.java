package day25_CoreJava_JDBC;

import java.sql.*;

public class BatchUpdateDemo {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet resultSet;
        int rs;
        PreparedStatement preparedStatement;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_Demo","root","Moofie@2901");
            preparedStatement = connection.prepareStatement("insert into teacher2(name,designation) values(?,?)");
//            preparedStatement.setString(1,"aarti");
//            preparedStatement.setString(2,"java teacher");
//            preparedStatement.addBatch(); //added this in a batch
//            preparedStatement.setString(1,"anirudh");
//            preparedStatement.setString(2,"react teacher");
//            preparedStatement.addBatch(); //added this in a batch
//            preparedStatement.setString(1,"mahesh");
//            preparedStatement.setString(2,".net teacher");
//            preparedStatement.addBatch(); //added this in a batch
//            preparedStatement.setString(1,"dhanashri");
//            preparedStatement.setString(2,"python teacher");
//            preparedStatement.addBatch(); //added this in a batch
//            preparedStatement.executeBatch();//the all queries in above batch gets executed here
            resultSet = preparedStatement.executeQuery("select * from teacher2");
            while(resultSet.next()){
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
            }
            System.out.println("======================================================================================");
            preparedStatement = connection.prepareStatement("UPDATE teacher2 SET name ='aarti mam' WHERE id=?");
            preparedStatement.setInt(1,1);
            preparedStatement.addBatch();//added this in a batch
            preparedStatement = connection.prepareStatement("delete from teacher2 where id = ?");
            preparedStatement.setInt(1,4);
            preparedStatement.addBatch();//added this in a batch
            preparedStatement.executeBatch();//the all queries in above batch gets executed here
            resultSet = preparedStatement.executeQuery("select * from teacher2");
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
