package JavaClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRecordFetching {
    public static StudentPojo fetchRecord(int id,int age){
        Connection connection = ConnectionProviderDao.getConnection();
        ResultSet resultSet = null;
        int id1 = 0;
        int age1 = 0;
        String name1 = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from students_data where id = ?");
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                id1 = resultSet.getInt(1);
                name1 = resultSet.getString(2);
                age1 = resultSet.getInt(3);
            }
            if (id==id1 && age==age1){
                StudentPojo studentPojo = new StudentPojo(id1,name1,age1);
                return studentPojo;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
