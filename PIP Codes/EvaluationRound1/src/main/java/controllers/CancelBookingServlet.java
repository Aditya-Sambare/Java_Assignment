package controllers;

import services.DatabaseServices;
import services.DatabaseServicesImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CancelBookingServlet")
public class CancelBookingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int roomBookingId = Integer.parseInt(req.getParameter("roomBookingId"));
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        String result = databaseServices.cancelRoomBooking(roomBookingId);
        printWriter.println(result);
        printWriter.println("<a href='WelcomePage.html'>click here to go back to welcome page</a>");

    }
}
