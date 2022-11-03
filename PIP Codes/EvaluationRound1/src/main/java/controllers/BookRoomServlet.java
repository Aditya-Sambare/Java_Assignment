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
       printWriter.println("<h2>"+result+"</h2><hr>");
        printWriter.println("<h4><a href='WelcomePage.html'>click here to go back to welcome page</a></h4>");
        printWriter.println("</main></body>\n" +
                "</html>");
    }
}