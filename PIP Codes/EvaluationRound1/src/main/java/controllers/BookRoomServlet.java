package controllers;

import entity.ConferenceRoom;
import entity.RoomBooking;
import entity.User;
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

@WebServlet("/BookRoomServlet")
public class BookRoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int userId = Integer.parseInt(req.getParameter("userId"));
        int roomId = Integer.parseInt(req.getParameter("roomId"));
        String date1 = req.getParameter("date");
        Date date = java.sql.Date.valueOf(date1);
        String time1 = req.getParameter("startingTime")+":00" ;
        String time2 = req.getParameter("endingTime")+":00";
        Time startingTime = Time.valueOf(time1);
        Time endingTime = Time.valueOf(time2);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        RoomBooking roomBooking = new RoomBooking();
        roomBooking.setBookingDate(date);
        roomBooking.setStartingTime(startingTime);
        roomBooking.setEndingTime(endingTime);
        User user = databaseServices.getUser(userId);
        ConferenceRoom room = databaseServices.getroom(roomId);
        roomBooking.setConferenceRoom(room);
        roomBooking.setUser(user);
        String result = databaseServices.addRoomBooking(roomBooking,roomId);
       printWriter.println(result);
        printWriter.println("<a href='WelcomePage.html'>click here to go back to welcome page</a>");
    }
}