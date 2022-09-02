package day25_CoreJava_JDBC;

import java.sql.*;

public class JdbcBatchExecution {
    public static void main(String[] args) {
        Connection connection;
        CallableStatement callableStatement;
        Statement statement;
        ResultSet resultSet;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_intern_batch2","root","Moofie@2901");
           // statement = connection.createStatement();
            callableStatement = connection.prepareCall("{call insertData(?,?,?)}");
            //statement.addBatch("insert into student values(14,'devayush','bhopal')");
           // statement.addBatch("insert into student values(15,'xyz','indore')");
            //statement.addBatch("insert into student values(13,'abc','nagpur')");
            //statement.addBatch("insert into student values(12,'lmn','solapur')");
            //statement.addBatch("update student set city='banglore' where id=3");
            //statement.addBatch("delete from student where id = 6");
           // int count [] = statement.executeBatch();
            //System.out.println("count is :: "+count.length);
            callableStatement.setInt(1,12);
            callableStatement.setString(2,"Anuj");
            callableStatement.setString(3,"Dehradun");
            callableStatement.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}