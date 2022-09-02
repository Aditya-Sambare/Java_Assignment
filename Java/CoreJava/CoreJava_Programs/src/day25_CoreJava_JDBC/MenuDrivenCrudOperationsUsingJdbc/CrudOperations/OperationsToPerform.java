package day25_CoreJava_JDBC.MenuDrivenCrudOperationsUsingJdbc.CrudOperations;

import day21_CoreJava_Collections.ComparatorMenuDrivenDemo.Employee;
import day25_CoreJava_JDBC.MenuDrivenCrudOperationsUsingJdbc.SetConnection.ProvideConnection;
import day25_CoreJava_JDBC.MenuDrivenCrudOperationsUsingJdbc.pojo.EmployeeDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public class OperationsToPerform {
    public Set<EmployeeDao> employeeDaoSet = new HashSet<>();
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    public void insertRecord(){
        Connection connection = ProvideConnection.getConnection();
        PreparedStatement preparedStatement;
        try {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");
            System.out.println("ENTER EMPLOYEE ID :");
            int id = Integer.parseInt(bufferedReader.readLine());
            System.out.println("ENTER EMPLOYEE NAME :");
            String name = bufferedReader.readLine();
            System.out.println("ENTER EMPLOYEE SALARY :");
            int salary = Integer.parseInt(bufferedReader.readLine());
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,salary);
            int resultset = preparedStatement.executeUpdate();
            if (resultset > 0){
                System.out.println(resultset+" RECORD INSERTED");
            }else {
                System.out.println("SOMETHING WENT WRONG PLEASE TRY AGAIN");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    public void deleteRecord(){
        Connection connection = ProvideConnection.getConnection();
        PreparedStatement preparedStatement;
        try {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            preparedStatement = connection.prepareStatement("delete from employee where id = ?");
            System.out.println("ENTER EMPLOYEE ID :");
            int id = Integer.parseInt(bufferedReader.readLine());
            preparedStatement.setInt(1,id);
            int resultset = preparedStatement.executeUpdate();
            if (resultset > 0){
                System.out.println(resultset+" RECORD DELETED");
            }else {
                System.out.println("SOMETHING WENT WRONG PLEASE TRY AGAIN");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    public void fetchParticularRecord(){
        Connection connection = ProvideConnection.getConnection();
        PreparedStatement preparedStatement;
        try {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            preparedStatement = connection.prepareStatement("select * from employee where id=?");
            System.out.println("ENTER EMPLOYEE ID :");
            int id = Integer.parseInt(bufferedReader.readLine());
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("EMPLOYEE ID IS "+resultSet.getInt(1)+" EMPLOYEE NAME IS "+resultSet.getString(2)+" EMPLOYEE SALARY IS "+resultSet.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

public void fetchAllRecords(){
    Connection connection = ProvideConnection.getConnection();
    PreparedStatement preparedStatement;
    try {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        preparedStatement = connection.prepareStatement("select * from employee");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println("EMPLOYEE ID IS "+resultSet.getInt(1)+" EMPLOYEE NAME IS "+resultSet.getString(2)+" EMPLOYEE SALARY IS "+resultSet.getInt(3));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void updateRecord(){
    Connection connection = ProvideConnection.getConnection();
    PreparedStatement preparedStatement;
    try {System.out.println("-----------------------------------------------------------------------------------------------------");
        preparedStatement = connection.prepareStatement("update employee set name = ?, salary = ? where id=?");
        System.out.println("ENTER ID FOR WHICH YOU WANT TO UPDATE");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.println("ENTER THE UPDATED NAME");
        String name = bufferedReader.readLine();
        System.out.println("ENTER THE UPDATED SALARY");
        int salary = Integer.parseInt(bufferedReader.readLine());
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,salary);
        preparedStatement.setInt(3,id);
        int resultset = preparedStatement.executeUpdate();
        if (resultset > 0){
            System.out.println(resultset+" RECORD UPDATED");
        }else{
            System.out.println("SOMETHING WENT WRONG PLEASE TRY AGAIN");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public void sortTheRecords(){
    Connection connection = ProvideConnection.getConnection();
    PreparedStatement preparedStatement;
        try {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            preparedStatement = connection.prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                employeeDaoSet.add(new EmployeeDao(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3)));
            }
            System.out.println("ENTER 1 TO SORT BY ID \nENTER 2 TO SORT BY NAME \nENTER 3 TO SORT BY SALARY");
            int sortbynumber = Integer.parseInt(bufferedReader.readLine());
            switch (sortbynumber){
                case 1:
                    List<EmployeeDao> employeeSetSortedById = employeeDaoSet.stream().sorted(Comparator.comparing(s->s.getEmployeeId())).collect(Collectors.toList());
                    System.out.println(employeeSetSortedById);
                    break;
                case 2:
                    List<EmployeeDao> employeeSetSortedByName = employeeDaoSet.stream().sorted(Comparator.comparing(s->s.getEmployeeName())).collect(Collectors.toList());
                    System.out.println(employeeSetSortedByName);
                    break;
                case 3:
                    List<EmployeeDao> employeeSetSortedBySalary = employeeDaoSet.stream().sorted(Comparator.comparing(s->s.getEmployeeSalary())).collect(Collectors.toList());
                    System.out.println(employeeSetSortedBySalary);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    System.out.println("-----------------------------------------------------------------------------------------------------");
}
}
