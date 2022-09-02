package September02Test;

import September02Test.ConnectionMaker.ConnectionDetails;
import September02Test.ConnectionMaker.ProvideConnection;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud{
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    int rs;
    public void createTable(){
        try {
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            preparedStatement = connection.prepareStatement("create table book_details(id int,name varchar(95),publisher varchar(95)," +
                    "price int,author varchar(95))");
            rs = preparedStatement.executeUpdate();
            if (rs > 0){
                System.out.println("TABLE CREATED");
            }else{
                System.out.println("SOMETHING WENT WRONG");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
    public void insertRecord(){
        try {
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            preparedStatement = connection.prepareStatement("insert into book_details (id,name,publisher,price,author) values(?,?,?,?,?)");
            System.out.println("ENTER ID");
            int id = Integer.parseInt(bufferedReader.readLine());
            System.out.println("ENTER NAME");
            String name = bufferedReader.readLine();
            System.out.println("ENTER PUBLISHER");
            String publisher = bufferedReader.readLine();
            System.out.println("ENTER PRICE");
            int price = Integer.parseInt(bufferedReader.readLine());
            System.out.println("ENTER AUTHOR");
            String author = bufferedReader.readLine();
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,publisher);
            preparedStatement.setInt(4,price);
            preparedStatement.setString(5,author);
            rs = preparedStatement.executeUpdate();
            if (rs > 0){
                System.out.println("RECORD INSERTED");
            }else{
                System.out.println("SOMETHING WENT WRONG");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
    public void fetchAllRecords(){
        try {
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            preparedStatement = connection.prepareStatement("select * from book_details");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("BOOK ID IS "+resultSet.getInt(1)+" BOOK NAME IS "+resultSet.getString(2)+" BOOK PUBLISHER IS "+resultSet.getString(3)+" BOOK PRICE IS "+resultSet.getInt(4)+" BOOK AUTHOR IS "+resultSet.getString(5));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
    public void updateRecord(){
        try {
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            preparedStatement = connection.prepareStatement("update book_details set price=? where id=?");
            System.out.println("ENTER ID FOR WHICH YOU HAVE TO UPDATE PRICE");
            int id = Integer.parseInt(bufferedReader.readLine());
            System.out.println("ENTER UPDATED PRICE");
            int price = Integer.parseInt(bufferedReader.readLine());
            preparedStatement.setInt(1,price);
            preparedStatement.setInt(2,id);
            rs = preparedStatement.executeUpdate();
            if (rs > 0){
                System.out.println(rs+" RECORD UPDATED");
            }else{
                System.out.println("SOMETHING WENT WRONG");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
    public void deleteRecord(){
        try {
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            preparedStatement = connection.prepareStatement("delete from book_details where id=?");
            System.out.println("ENTER ID FOR WHICH YOU HAVE TO DELETE RECORD");
            int id = Integer.parseInt(bufferedReader.readLine());
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeUpdate();
            if (rs > 0){
                System.out.println(rs+" RECORD DELETED");
            }else{
                System.out.println("SOMETHING WENT WRONG");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
    public void publisherByAuthor(){
        try {
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            preparedStatement = connection.prepareStatement("select a.publisher,b.author from book_details a inner join book_details b on a.id=b.id order by a.publisher");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(" BOOK PUBLISHER IS "+resultSet.getString(1)+" BOOK AUTHOR IS "+resultSet.getString(2));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
}
