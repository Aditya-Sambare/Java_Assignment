

package day25_CoreJava_JDBC;
import java.io.*;
import java.sql.*;
public class ImageOperations {
    public static void main(String[] args) {
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_intern_batch2","root","Moofie@2901");
//            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\coditas\\Desktop\\Java_Assignment\\Java\\CoreJava\\CoreJava_Programs\\src\\day25_CoreJava_JDBC\\DogImage.jpeg");
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into images values(?,?)");
//            preparedStatement.setInt(1,1);
//            preparedStatement.setBlob(2,fileInputStream);
//            preparedStatement.execute();
//            fileInputStream.close();
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from images");
            ResultSet resultSet = preparedStatement1.executeQuery();
            FileOutputStream fileOutputStream = new FileOutputStream("DogImage111.jpeg");
            while(resultSet.next()){
                fileOutputStream.write(resultSet.getBytes(2));
            }
            fileOutputStream.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
