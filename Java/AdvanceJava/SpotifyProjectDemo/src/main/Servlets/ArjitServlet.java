package Servlets;
import DataBaseConnectionDAO.ConnectionProvider;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@WebServlet("/ArjitServlet")
public class ArjitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setContentType("audio/mpeg");
        PrintWriter printWriter = resp.getWriter();
        ResultSet resultSet = null;
        Connection connection = ConnectionProvider.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from arjit_audio");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                printWriter.println("<audio controls>" +
                        "<source src="+resultSet.getString(1)+">" + "</audio>");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
