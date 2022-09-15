package ControllersServlets;

import DatabaseOperations.ValidateUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("name",name);
        httpSession.setAttribute("password",password);
        if(name.equals("admin") && password.equals("admin123")){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminServlet");
            requestDispatcher.forward(req,resp);
        }else{
           ResultSet resultSet =  ValidateUser.validateUserAndDisplay(name,password);
          try{
              while(resultSet.next()){
                  out.println("Employee id is "+resultSet.getInt(1)+" Employee password is "+resultSet.getString(2)+
                          " Employee name is "+resultSet.getString(3)+" Employee address is "+resultSet.getString(4)+"Employee age is "+resultSet.getInt(5));
                  out.println("<br>");
                  out.println("<a href='logout'>log out</a>");
              }
          } catch (SQLException e) {
              e.printStackTrace();
          }
        }

    }
}
