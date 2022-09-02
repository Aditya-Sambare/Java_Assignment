package day25_CoreJava_JDBC;

import java.sql.*;

public class ResultSet_And_DataBase_MeteDataDemo {
    public static void main(String[] args) {
        Connection connection;
        ResultSet resultSet;
        Statement statement;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_Demo","root","Moofie@2901");
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from teacher");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getDriverVersion());
            System.out.println(databaseMetaData.getSchemas());
            System.out.println(resultSetMetaData.getColumnCount());
            System.out.println(resultSetMetaData.getColumnName(1));
            System.out.println(resultSetMetaData.getColumnName(2));
            System.out.println(resultSetMetaData.getColumnName(3));
            System.out.println(resultSetMetaData.getColumnType(1));
            System.out.println(resultSetMetaData.getColumnType(2));
            System.out.println(resultSetMetaData.getTableName(1));
            System.out.println(resultSetMetaData.getSchemaName(1));
            System.out.println(resultSetMetaData.isNullable(1));
            System.out.println(resultSetMetaData.getColumnLabel(1));
            System.out.println(resultSetMetaData.getCatalogName(1));
            System.out.println(resultSetMetaData.getScale(1));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
