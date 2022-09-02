package day25_CoreJava_JDBC;

import java.sql.*;
import java.util.Collection;
import java.util.Scanner;

class UpdateRecordsWithResultSet {
    PreparedStatement preparedStatement;
    Connection connection;
    Statement statement;
    Scanner scanner = new Scanner(System.in);
    ResultSet resultSet;
    void operationsWithResultsetTypeScrollSenseitiveAndUpdatable(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_intern_batch2","root","Moofie@2901");
            preparedStatement = connection.prepareStatement("insert into teacher(name,designation) values(?,?)",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("how many records you want to enter");
            int numberOfRecods = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < numberOfRecods; i++) {
                if(numberOfRecods == 0){
                    break;
                }
                System.out.println("enter name");
                String name = scanner.nextLine();
                System.out.println("enter designation");
                String designation = scanner.nextLine();
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,designation);
                preparedStatement.execute();
            }
            System.out.println("records inserted successfully");
            preparedStatement = connection.prepareStatement("select * from teacher",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("====================================================================================================================================================");
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
                System.out.println("====================================================================================================================================================");
            }
            resultSet.close();
            preparedStatement = connection.prepareStatement("select * from teacher",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();
            resultSet.absolute(1);
            resultSet.updateInt(1,1);
            resultSet.updateRow();
            resultSet.absolute(2);
            resultSet.updateInt(1,2);
            resultSet.updateRow();
            resultSet.absolute(3);
            resultSet.updateInt(1,3);
            resultSet.updateRow();
            preparedStatement = connection.prepareStatement("select * from teacher");
            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//                System.out.println("====================================================================================================================================================");
//                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
//                System.out.println("====================================================================================================================================================");
//            }
            System.out.println("enter message");
            String message = scanner.nextLine();
            while (resultSet.next()){
                System.out.println("====================================================================================================================================================");
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
                System.out.println("====================================================================================================================================================");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void operationsWithResultsetTypeScrollInSenseitiveAndUpdatable(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_intern_batch2","root","Moofie@2901");
            preparedStatement = connection.prepareStatement("insert into teacher1(name,designation) values(?,?)",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("how many records you want to enter");
            int numberOfRecods = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < numberOfRecods; i++) {
                if(numberOfRecods == 0){
                    break;
                }
                System.out.println("enter name");
                String name = scanner.nextLine();
                System.out.println("enter designation");
                String designation = scanner.nextLine();
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,designation);
                preparedStatement.execute();
            }
            System.out.println("records inserted successfully");
            preparedStatement = connection.prepareStatement("select * from teacher",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("====================================================================================================================================================");
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
                System.out.println("====================================================================================================================================================");
            }
            resultSet.close();
            preparedStatement = connection.prepareStatement("select * from teacher",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();
            resultSet.absolute(1);
            resultSet.updateString(2,"Sambare");
            resultSet.updateRow();
            resultSet.absolute(2);
            resultSet.updateString(2," Dubey");
            resultSet.updateRow();
            resultSet.absolute(3);
            resultSet.updateString(2," Sundriyal");
            resultSet.updateRow();
            preparedStatement = connection.prepareStatement("select * from teacher");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("====================================================================================================================================================");
                System.out.println("id is "+resultSet.getInt(1) +" name is " + resultSet.getString(2)+" designation is "+resultSet.getString(3));
                System.out.println("====================================================================================================================================================");
            }
            System.out.println("enter message");
            String message = scanner.nextLine();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
