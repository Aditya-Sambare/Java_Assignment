package Dao;

import com.bean.Address;
import com.bean.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void insertrecord() throws IOException {
        System.out.println("=======================================================================");
        System.out.println("Enter aid\nEnter flat no\nEnter pincode\nEnter city");
        System.out.println("=======================================================================");
        int aid = Integer.parseInt(bufferedReader.readLine());
        int flatno = Integer.parseInt(bufferedReader.readLine());
        int pincode = Integer.parseInt(bufferedReader.readLine());
        String city = bufferedReader.readLine();
        System.out.println("=======================================================================");
        System.out.println("Enter id\nEnter first name\nEnter last name\nEnter salary");
        System.out.println("=======================================================================");
        int id = Integer.parseInt(bufferedReader.readLine());
        String firstname = bufferedReader.readLine();
        String lastname = bufferedReader.readLine();
        int salary = Integer.parseInt(bufferedReader.readLine());
        String sqlquery = "insert into address values(?,?,?,?)";
        String sqlQuery1 = "insert into employee values(?,?,?,?,?)";
        int execution1 = jdbcTemplate.update(sqlquery,aid,flatno,pincode,city);
        if (execution1 > 0){
            System.out.println("=======================================================================");
            System.out.println(execution1+" address inserted");
            System.out.println("=======================================================================");
        }else {
            System.out.println("=======================================================================");
            System.out.println("Something went wrong");
            System.out.println("=======================================================================");
        }
        int execution = jdbcTemplate.update(sqlQuery1,id,firstname,lastname,salary,aid);
        if (execution > 0){
            System.out.println("=======================================================================");
            System.out.println(execution+" Record inserted");
            System.out.println("=======================================================================");
        }else {
            System.out.println("=======================================================================");
            System.out.println("Something went wrong");
            System.out.println("=======================================================================");
        }

    }
    public void fetchrecords(){
        String sqlquery1 = "select * from address inner join employee on employee.aid=address.aid";
        List<Object> employeeList = jdbcTemplate.query(sqlquery1, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                List<Employee> list = new ArrayList<>();
                Address address = new Address();
                Employee employee = new Employee();
                address.setAid(resultSet.getInt(1));
                address.setFaltno(resultSet.getInt(2));
                address.setPincode(resultSet.getInt(3));
                address.setCity(resultSet.getString(4));
                employee.setId(resultSet.getInt(5));
                employee.setFirstname(resultSet.getString(6));
                employee.setLastname(resultSet.getString(7));
                employee.setSalary(resultSet.getInt(8));
                employee.setAddress(address);
                 list.add(employee);
                return employee;
            }
        });
        System.out.println(employeeList);
    }
    public void update() throws IOException {
        System.out.println("=======================================================================");
        System.out.println("Enter id of employee to update salary");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.println("=======================================================================");
        String query="update employee set salary = salary+10000 where id = ?";

        int execution = jdbcTemplate.update(query,id);
        if (execution > 0){
            System.out.println("=======================================================================");
            System.out.println(execution+" Record inserted");
            System.out.println("=======================================================================");
        }else {
            System.out.println("=======================================================================");
            System.out.println("Something went wrong");
            System.out.println("=======================================================================");
        }

    }
    public void delete() throws IOException {
        System.out.println("=======================================================================");
        System.out.println("Enter Address id of employee to delete record");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.println("=======================================================================");
        String query="delete from employee where aid = ?";
        String query1="delete from address where aid = ?";
        int execution = jdbcTemplate.update(query,id);
        int execution1 = jdbcTemplate.update(query1,id);
        if (execution > 0 && execution1 > 0){
            System.out.println("=======================================================================");
            System.out.println(execution+" Record deleted");
            System.out.println("=======================================================================");
        }else {
            System.out.println("=======================================================================");
            System.out.println("Something went wrong");
            System.out.println("=======================================================================");
        }

    }
    public void sortbylastname(){
        String query = "select * from address inner join employee on employee.aid=address.aid order by lastname";
        List<Object> employeeList = jdbcTemplate.query(query, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                List<Employee> list = new ArrayList<>();
                Address address = new Address();
                Employee employee = new Employee();
                address.setAid(resultSet.getInt(1));
                address.setFaltno(resultSet.getInt(2));
                address.setPincode(resultSet.getInt(3));
                address.setCity(resultSet.getString(4));
                employee.setId(resultSet.getInt(5));
                employee.setFirstname(resultSet.getString(6));
                employee.setLastname(resultSet.getString(7));
                employee.setSalary(resultSet.getInt(8));
                employee.setAddress(address);
                list.add(employee);
                return employee;
            }
        });
        System.out.println(employeeList);
    }
    public void fetchbysalaryandcity(){
        String query = "select * from address inner join employee on employee.aid=address.aid where employee.salary > 10000 and address.city='mumbai'";
        List<Object> employeeList = jdbcTemplate.query(query, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                List<Employee> list = new ArrayList<>();
                Address address = new Address();
                Employee employee = new Employee();
                address.setAid(resultSet.getInt(1));
                address.setFaltno(resultSet.getInt(2));
                address.setPincode(resultSet.getInt(3));
                address.setCity(resultSet.getString(4));
                employee.setId(resultSet.getInt(5));
                employee.setFirstname(resultSet.getString(6));
                employee.setLastname(resultSet.getString(7));
                employee.setSalary(resultSet.getInt(8));
                employee.setAddress(address);
                list.add(employee);
                return employee;
            }
        });
        System.out.println(employeeList);

    }
}
