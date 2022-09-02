package day25_CoreJava_JDBC;
import java.sql.*;
import java.util.Scanner;
public class Commit_Rollback_Savepoint_Demo {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        ResultSet resultSet;
        Savepoint savepoint1 = null;
        int rs;
        Scanner sc =new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_Demo","root","Moofie@2901");
            connection.setAutoCommit(false);
            PreparedStatement preparedStatementpt = connection.prepareStatement("insert into transaction values(?,?)");
            preparedStatementpt.setInt(1,3);
            preparedStatementpt.setInt(2,100000);
            preparedStatementpt.executeUpdate();
            PreparedStatement preparedStatementpt1 = connection.prepareStatement("insert into transaction values(?,?)");
            preparedStatementpt1.setInt(1,4);
            preparedStatementpt1.setInt(2,100000);
            preparedStatementpt1.executeUpdate();
            savepoint1=connection.setSavepoint();
            PreparedStatement preparedStatement11 = connection.prepareStatement("select * from transaction");
            resultSet = preparedStatement11.executeQuery();
            while(resultSet.next()){
                System.out.println("id is"+resultSet.getInt(1)+" and balance is "+resultSet.getInt(2));
            }
            System.out.println("enter the account id from which you want to send money");
            int fromAccount = Integer.parseInt(sc.nextLine());
            PreparedStatement preparedStatement= connection.prepareStatement("select balance from transaction where id=?");
            preparedStatement.setInt(1,fromAccount);
            ResultSet resultSet1 = preparedStatement.executeQuery();
            resultSet1.next();
            int currentbalance=resultSet1.getInt(1);
            System.out.println("enter the account id to which you you want to send money");
            int toAccount = Integer.parseInt(sc.nextLine());
            System.out.println("enter the amount you want to transfer");
            int amountToTransfer = Integer.parseInt(sc.nextLine());
            if(amountToTransfer>currentbalance)
            {
                System.out.println("entered wrong amount" +
                        "\n insufficient balance");
            }
            PreparedStatement preparedStatement1 = connection.prepareStatement("update transaction set balance=balance-? where id=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            PreparedStatement preparedStatement2 = connection.prepareStatement("update transaction set balance=balance+? where id=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            preparedStatement1.setInt(1,amountToTransfer);
            preparedStatement1.setInt(2,fromAccount);
            preparedStatement1.executeUpdate();
            preparedStatement2.setInt(1,amountToTransfer);
            preparedStatement2.setInt(2,toAccount);
            rs = preparedStatement2.executeUpdate();
            if(rs == 0){
                throw new Exception();
            }
            PreparedStatement preparedStatement12 = connection.prepareStatement("select * from transaction");
            resultSet = preparedStatement12.executeQuery();
            while(resultSet.next()){
                System.out.println("id is"+resultSet.getInt(1)+" and balance is "+resultSet.getInt(2));
            }

        } catch (Exception e) {
            try {
                connection.rollback(savepoint1);
                System.out.println("rollback successfull");
            }catch (Exception r){
            }
            e.printStackTrace();
        }
        connection.commit();
        connection.close();
    }
}
