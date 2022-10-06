package controllerServlets;
import databaseConnectionDao.ConnectionDataBaseImplementation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.StudentPojo;
import pojo.SubjectPojo;
import services.StudentServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/InsertStudentServlet")
public class InsertStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int studentId = Integer.parseInt(req.getParameter("StudentId"));
        String studentName = req.getParameter("StudentName");
        String Subject1 = req.getParameter("SubjectName1");
        int marks1 = Integer.parseInt(req.getParameter("marks1"));
        String status1 = null;
        if (marks1>35){
            status1 = "pass";
        }else {
        status1 = "fail";
        }
        String Subject2 = req.getParameter("SubjectName2");
        int marks2 = Integer.parseInt(req.getParameter("marks2"));
        String status2 = null;
        if (marks2>35){
            status2 = "pass";
        }else {
            status2 = "fail";
        }
        SubjectPojo subject1 = new SubjectPojo();
        //subject1.setStudentId(studentId);
        subject1.setSubjectName(Subject1);
        subject1.setMarks(marks1);
        subject1.setStatus(status1);
        SubjectPojo subject2 = new SubjectPojo();
        //subject2.setStudentId(studentId);
        subject2.setSubjectName(Subject2);
        subject2.setMarks(marks2);
        subject2.setStatus(status2);
        ConnectionDataBaseImplementation connectionDataBaseImplementation = new ConnectionDataBaseImplementation();
        SessionFactory sessionFactory = connectionDataBaseImplementation.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(subject1);
        session.save(subject2);
        transaction.commit();
        session.close();
        List<SubjectPojo> subjectList = new ArrayList<>();
        subjectList.add(subject1);
        subjectList.add(subject2);
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setStudentId(studentId);
        studentPojo.setStudentName(studentName);
        studentPojo.setSubjects(subjectList);
        StudentServices.insertStudentRecord(studentPojo);
    }
    }

