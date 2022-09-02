package day25_CoreJava_JDBC;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class InsertFileIntoDataBaseDemo {
    public static void main(String[] args) {
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        int rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_Demo","root","Moofie@2901");
            preparedStatement = connection.prepareStatement("insert into file_table values(?,?)");
            FileReader fileReader = new FileReader("C:\\Users\\coditas\\Desktop\\Java_Assignment\\Java\\CoreJava\\CoreJava_Programs\\src\\day25_CoreJava_JDBC\\JDBCDemo.java");
            preparedStatement.setInt(1,1);
            preparedStatement.setCharacterStream(2,fileReader);
            preparedStatement.executeUpdate();
            fileReader.close();

            FileWriter fileWriter = new FileWriter("fileFetchFromDatabase.java");
            preparedStatement = connection.prepareStatement("select * from file_table");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                fileWriter.write(String.valueOf(resultSet.getBytes(2)));
            }
            fileWriter.flush();
            fileWriter.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
