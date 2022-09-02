package day25_CoreJava_JDBC;
import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) {
        Connection con;
        Statement statement;
        int resultSet;
        ResultSet resultSet1;
        try {
            //DriverManager
            Class.forName("com.mysql.jdbc.Driver");
            //Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_intern_batch2","root","Moofie@2901");
            statement = con.createStatement();
//            String query = "insert into student values(?,?,?)";
//            PreparedStatement preparedStatement = con.prepareStatement(query);
//            preparedStatement.setInt(1,11);
//            preparedStatement.setString(2,"devansh");
//            preparedStatement.setString(3,"kanpur");
//            resultSet = preparedStatement.executeUpdate();
//            System.out.println(resultSet+" record inserted");
//            resultSet = statement.executeUpdate("insert into student(id,name,city) values(22,'omkar','wardha')");
//            resultSet1 = statement.executeQuery("select * from student");
//            while(resultSet1.next()){
//                System.out.println("id is "+resultSet1.getInt(1) +" name is " + resultSet1.getString(2)+" city is "+resultSet1.getString(3));
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
