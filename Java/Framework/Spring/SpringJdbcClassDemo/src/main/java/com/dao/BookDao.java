package com.dao;

import com.bean.Book;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private JdbcTemplate jdbcTemplate;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int insertBook(String bookname,String authorname,float price) throws IOException {
//        System.out.println("================================================================================================================");
//        System.out.println("Enter Bookname\nEnter Authorname\nEnter price");
//        System.out.println("================================================================================================================");
//        String bookname= bufferedReader.readLine();
//String authorname = bufferedReader.readLine();
//float price = Float.parseFloat(bufferedReader.readLine());
//Book book = new Book();
//book.setBookname(bookname);
//book.setAuthorname(authorname);
//book.setPrice(price);
        String sql = "insert into JTBookDetails values (?,?,?,?)";
       //Object [] values = {null,book.getBookname(),book.getAuthorname(),book.getPrice()};
        int execution = jdbcTemplate.update(sql,null,bookname,authorname,price);
        return execution;
//        if (execution>0){
//            System.out.println("================================================================================================================");
//            System.out.println(execution +" record inserted");
//    }else{
//            System.out.println("================================================================================================================");
//            System.out.println("Someting went wrong");
//        }
    }
    public List<Book> fetchAllBooks(){
//        System.out.println("Available Books are : ");
        String sqlQuery = "select * from JTBookDetails";
        List<Book> list = jdbcTemplate.query(sqlQuery, new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setBid(resultSet.getInt(1));
                book.setBookname(resultSet.getString(2));
                book.setAuthorname(resultSet.getString(3));
                book.setPrice(resultSet.getFloat(4));
                return book;
            }
        });
//        System.out.println(list);
        return list;
    }
    public int updateBook(float price, String bookname) throws IOException {
//        System.out.println("================================================================================================================");
//        System.out.println("Enter the book name and updated price");
//        String bookname = bufferedReader.readLine();
//        float price = Float.parseFloat(bufferedReader.readLine());
        String sqlQuery = "update JTBookDetails set price = ? where bookname=?";
        int execution = jdbcTemplate.update(sqlQuery,price,bookname);
//        if (execution>0){
//            System.out.println("================================================================================================================");
//            System.out.println(execution +" book updated");
//        }else{
//            System.out.println("================================================================================================================");
//
//            System.out.println("Something went wrong");
//        }
        return execution;
    }
    public void deleteBook() throws IOException {
        System.out.println("================================================================================================================");
        System.out.println("Enter the book name which you want to delete");
        String bookname = bufferedReader.readLine();
        float price = Float.parseFloat(bufferedReader.readLine());
        String sqlQuery = "delete from JTBookDetails where bookname=?";
        int execution = jdbcTemplate.update(sqlQuery,bookname);
        if (execution>0){
            System.out.println("================================================================================================================");

            System.out.println(execution +" book deleted");
        }else{
            System.out.println("================================================================================================================");

            System.out.println("Something went wrong");
        }
    }
    public void fetchParticularBook() throws IOException {
        String sqlQuery = "select * from JTBookDetails where bookname=?";
        System.out.println("================================================================================================================");
        System.out.println("Enter the book name for which you want details");
        String bookName = bufferedReader.readLine();
        List<Book> list = jdbcTemplate.query(sqlQuery, new ResultSetExtractor<List<Book>>() {
            List<Book> booklist =new ArrayList();
            @Override
            public List<Book> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                resultSet.next();
                Book book = new Book();
                book.setBid(resultSet.getInt(1));
                book.setBookname(resultSet.getString(2));
                book.setAuthorname(resultSet.getString(3));
                book.setPrice(resultSet.getFloat(4));
                booklist.add(book);
                return booklist;
            }
        },bookName);
        System.out.println(list);
    }
}
