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
        printWriter.println("<html lang=\"en\">" +
                "<style>\n" +
                "    body{\n" +
                "    text-align:center;\n" +
                "    background: url(\"https://images.unsplash.com/photo-1570126646281-5ec88111777f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8bWVldGluZyUyMHJvb218ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60\") center/cover no-repeat;\n" +
                "    }\n" +
                "    main{\n" +
                "    background: rgba(255,255,255,0.5);\n" +
                "    margin: 4rem;\n" +
                "    border: 0.2rem solid white;\n" +
                "    border-radius: 0.5rem;\n" +
                "    color: black;\n" +
                "    }\n" +
                "</style>\n" +
                "<body>\n" +
                "<main>");
       if (roomBookingList.size()==0){
           printWriter.println("<h1>SORRY NO BOOKINGS AVILABLE</h1>");
       }else {
           printWriter.println("<h1>AVILABLE BOOKINGS</h1>");
           for (RoomBooking roomBooking : roomBookingList) {
               printWriter.println("<h5>");
               printWriter.println("<hr>");
               printWriter.println("ROOM BOOKING ID IS : " + roomBooking.getBookingId());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING DATE IS : " + roomBooking.getBookingDate());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING STATUS IS : " + roomBooking.getBookingStatus());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING STARTING TIME IS : " + roomBooking.getStartingTime());
               printWriter.println("<br>");
               printWriter.println("ROOM BOOKING ENDING TIME IS : " + roomBooking.getEndingTime());
               printWriter.println("<br>");
               printWriter.println("BOOKED ROOM'S ID IS : " + roomBooking.getConferenceRoom().getRoomId());
               printWriter.println("<br>");
               printWriter.println("BOOKED ROOM'S NAME IS : " + roomBooking.getConferenceRoom().getRoomName());
               printWriter.println("<br>");
               printWriter.println("ROOM IS BOOKED BY THIS USER ID : " + roomBooking.getUser().getUserId());
               printWriter.println("<br>");
               printWriter.println("ROOM IS BOOKED BY : " + roomBooking.getUser().getUserName());
               printWriter.println("<hr></h5>");
           }
       }
        printWriter.println("<h4><a href='WelcomePage.html'>click here to go back to welcome page</a></h4>");
        printWriter.println("</main></body>\n" +
                "</html>");
    }
}
