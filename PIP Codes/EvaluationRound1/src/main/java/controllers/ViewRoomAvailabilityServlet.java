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
import java.sql.Date;
import java.sql.Time;

@WebServlet("/ViewRoomAvailabilityServlet")
public class ViewRoomAvailabilityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int roomId = Integer.parseInt(req.getParameter("roomId"));
        String date1 = req.getParameter("date");
        Date date = java.sql.Date.valueOf(date1);
        String time1 = req.getParameter("startTime")+":00" ;
        String time2 = req.getParameter("endTime")+":00";
        Time startingTime = Time.valueOf(time1);
        Time endingTime = Time.valueOf(time2);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
String result = databaseServices.viewRoomAvailability(roomId,date,startingTime,endingTime);
printWriter.println(result);
        printWriter.println("<a href='WelcomePage.html'>click here to go back to welcome page</a>");

    }
}
