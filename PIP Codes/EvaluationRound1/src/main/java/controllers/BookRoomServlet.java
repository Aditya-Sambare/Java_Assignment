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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        Date date;
        try {
             date=format.parse(date1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Date startingTime;
        Date endingTime;
        String time1 = req.getParameter("stratingTime");
        DateFormat format1 = new SimpleDateFormat("hh:mm");
        try {
             startingTime = format1.parse(time1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        String time2 = req.getParameter("endingTime");
//        DateFormat format2 = new SimpleDateFormat("hh:mm");
        try {
             endingTime = format1.parse(time2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        RoomBooking roomBooking = new RoomBooking();
        roomBooking.setBookingDate(date);
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
//String date=new Scanner().nextLine();
//
//SimpleDateFormat format=new SimpleDateFormat(“dd-mm-yyyy”);
//
//Date date=format.parse(date)
////////////////////////////////////
//Scanner input = new Scanner(System.in);
// System.out.print("Enter first time (hh:mm aa): ");
// String time = input.nextLine();
// System.out.println();
// System.out.print("Enter second time (hh:mm aa): ");
// String time2 = input.nextLine();
// System.out.println();
// DateFormat sdf = new SimpleDateFormat("hh:mm aa");
// Date d1 = sdf.parse(time);
// Date d2 = sdf.parse(time2);