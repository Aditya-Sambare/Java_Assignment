package September02Test;

import September02Test.Book;
import September02Test.ConnectionMaker.ConnectionDetails;
import September02Test.ConnectionMaker.ProvideConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortOperations {
    List<Book> bookList = new ArrayList<>();
    public void SortById(){
        try {        System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from book_details order by id desc");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("BOOK ID IS "+resultSet.getInt(1)+" BOOK NAME IS "+resultSet.getString(2)+" BOOK PUBLISHER IS "+resultSet.getString(3)+" BOOK PRICE IS "+resultSet.getInt(4)+" BOOK AUTHOR IS "+resultSet.getString(5));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
    public void SortByPublisher(){
        try {
            System.out.println("----------------------------------------------------------------------------------------------------------------------");

            Class.forName(ConnectionDetails.driver);
            Connection connection = ProvideConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from book_details order by publisher");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("BOOK ID IS "+resultSet.getInt(1)+" BOOK NAME IS "+resultSet.getString(2)+" BOOK PUBLISHER IS "+resultSet.getString(3)+" BOOK PRICE IS "+resultSet.getInt(4)+" BOOK AUTHOR IS "+resultSet.getString(5));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
}
