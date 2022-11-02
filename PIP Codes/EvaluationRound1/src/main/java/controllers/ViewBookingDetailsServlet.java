package controllers;

import entity.RoomBooking;
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
import java.util.List;

@WebServlet("/ViewBookingDetailsServlet")
public class ViewBookingDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String date1 = req.getParameter("date1");
        Date date11 = java.sql.Date.valueOf(date1);
        String date2 = req.getParameter("date2");
        Date date22 = java.sql.Date.valueOf(date2);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
       List<RoomBooking> roomBookingList = databaseServices.viewRoomBooking(date11,date22);
       if (roomBookingList.size()==0){
           printWriter.println("<h1>SORRY NO BOOKINGS AVILABLE</h1>");
       }else {
           for (RoomBooking roomBooking : roomBookingList) {
               printWriter.println("<hr>");
               printWriter.println("ROOM BOOKING ID IS :" + roomBooking.getBookingId());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING DATE IS :" + roomBooking.getBookingDate());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING STATUS IS :" + roomBooking.getBookingStatus());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING STARTING TIME IS :" + roomBooking.getStartingTime());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING ENDING TIME IS :" + roomBooking.getEndingTime());
               printWriter.println("<br>");
               printWriter.println("BOOKED ROOM'S ROOM ID IS :" + roomBooking.getConferenceRoom().getRoomId());
               printWriter.println("<br>");
               printWriter.println("BOOKED ROOM'S NAME IS :" + roomBooking.getConferenceRoom().getRoomName());
               printWriter.println("<br>");
               printWriter.println("ROOM IS BOOKED BY THIS USER ID" + roomBooking.getUser().getUserId());
               printWriter.println("<br>");
               printWriter.println("ROOM IS BOOKED BY THIS USER " + roomBooking.getUser().getUserName());
               printWriter.println("<hr>");
           }
       }
        printWriter.println("<a href='WelcomePage.html'>click here to go back to welcome page</a>");

    }
}
