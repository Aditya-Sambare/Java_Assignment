package controllers;

import Services.DatabaseServices;
import Services.DatabaseServicesImplementation;
import databaseConnectionDao.SessionFactoryProvider;
import entity.Marks;
import entity.Student;
import entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/FetchStudentServlet")
public class FetchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactoryMethod();
        Session session = sessionFactory.openSession();
        PrintWriter printWriter = resp.getWriter();
        int studentId = Integer.parseInt(req.getParameter("studentId"));
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        Student student = databaseServices.printStudents(studentId);
        printWriter.println("student id : "+student.getStudentId());
        printWriter.println("student name : "+student.getStudentName());
        List<Subject> subjects = student.getSubjects();
        int count = 0;
        while (count < subjects.size()) {
            Subject subject = subjects.get(count++);
            printWriter.println("subject id :"+subject.getSubjectId());
            printWriter.println("subject name :"+subject.getSubjectName());
            Query query = session.createQuery("from Marks where studentId=:stuId and subjectId=:subId");
            query.setParameter("stuId", studentId);
            query.setParameter("subId", subject.getSubjectId());
            List<Marks> marks = query.getResultList();
            Marks marks1 = marks.get(0);
            printWriter.println("marks : "+marks1.getMarks());
        }
    }
}