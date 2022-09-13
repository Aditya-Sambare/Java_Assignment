import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
    private EmployeeDao employeeDao = new EmployeeDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd =req.getRequestDispatcher("EmployeeRegister.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
      String lastname = req.getParameter("lastname");
      String username = req.getParameter("username");
      String password = req.getParameter("password");
      String address = req.getParameter("address");
      String contact = req.getParameter("contact");
      Employee employee = new Employee();
      employee.setFirstName(firstname);
      employee.setLastName(lastname);
      employee.setUserName(username);
      employee.setPassword(password);
      employee.setAddress(address);
      employee.setContact(contact);
        try {
            employeeDao.registerEmployee(employee);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        RequestDispatcher rd =req.getRequestDispatcher("EmployeeDetails.jsp");
        rd.forward(req,resp);
    }
}
