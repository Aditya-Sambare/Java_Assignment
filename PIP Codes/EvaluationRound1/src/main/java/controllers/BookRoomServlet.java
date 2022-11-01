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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;

@WebServlet("/BookRoomServlet")
public class BookRoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int userId = Integer.parseInt(req.getParameter("userId"));
        int roomId = Integer.parseInt(req.getParameter("roomId"));
        String date1 = req.getParameter("date");
        SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
        Date date = java.sql.Date.valueOf(date1);
        System.out.println(date);
        String time1 = req.getParameter("startingTime")+":00" ;
        String time2 = req.getParameter("endingTime")+":00";
        System.out.println(time1);
        System.out.println(time2);
        Time startingTime = Time.valueOf(time1);
        Time endingTime = Time.valueOf(time2);
//        DateFormat format2 = new SimpleDateFormat("hh:mm");
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        RoomBooking roomBooking = new RoomBooking();
        roomBooking.setBookingDate((java.sql.Date) date);
        roomBooking.setStartingTime(startingTime);
        roomBooking.setEndingTime(endingTime);
        User user = databaseServices.getuser(userId);
        ConferenceRoom room = databaseServices.getroom(roomId);
        roomBooking.setConferenceRoom(room);
        roomBooking.setUser(user);
        databaseServices.addRoomBooking(roomBooking);
        printWriter.println("Booking Successful");
        printWriter.println("<a href='WelcomePage.html'>click here to go back to welcome page</a>");
    }
}