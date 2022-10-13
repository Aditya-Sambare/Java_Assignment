package hibernateApplication;
import com.bean.relationships.manyToMany.Employee;
import com.bean.relationships.manyToMany.Projects;
import com.bean.relationships.oneToManyAndManyToOne.Answer1;
import com.bean.relationships.oneToManyAndManyToOne.Question1;
import com.bean.relationships.oneToOne.Answer;
import com.bean.relationships.oneToOne.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class HibernateRelationshipsApplication {
    static Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    static SessionFactory sessionFactory = configuration.buildSessionFactory();
    public static void main(String[] args) {


////one to one relationship
//        Question question = new Question();
//        Answer answer = new Answer();
//        answer.setAnswerId(1);
//        answer.setAnswer("programing language");
//        answer.setQuestion(question);
//        question.setQuestionId(12);
//        question.setQuestion("what is java");
//        question.setAnswer(answer);
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.save(answer);
//        session.getTransaction().commit();
//        List<Question> questionList = session.createQuery("from Question").list();
//        for(Question q : questionList){
//            System.out.println(q.getQuestionId());
//            System.out.println(q.getQuestion());
//            System.out.println(q.getAnswer().getAnswerId());
//            System.out.println(q.getAnswer().getAnswer());
//        }
//        session.close();


////one to many and many to one relationship
//        Question1 question1 = new Question1();
//        Answer1 answer1 = new Answer1();
//        answer1.setAnswerId(1);
//        answer1.setAnswer("java");
//        answer1.setQuestion(question1);
//        Answer1 answer11 = new Answer1();
//        answer11.setAnswerId(2);
//        answer11.setAnswer("python");
//        answer11.setQuestion(question1);
//        Answer1 answer12 = new Answer1();
//        answer12.setAnswerId(3);
//        answer12.setAnswer(".net");
//        answer12.setQuestion(question1);
//        question1.setQuestionId(1);
//        question1.setQuestion("domains in coditas");
//        List<Answer1> answer1List = new ArrayList<>();
//        answer1List.add(answer1);
//        answer1List.add(answer11);
//        answer1List.add(answer12);
//        question1.setAnswer(answer1List);
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.save(question1);
//        session.getTransaction().commit();
//        List<Question1> question1List = session.createQuery("from Question1").list();
//        for (Question1 q : question1List){
//            System.out.println(q.getQuestionId());
//            System.out.println(q.getQuestion());
//            for (Answer1 a : q.getAnswer()){
//                System.out.println(a.getAnswerId());
//                System.out.println(a.getAnswer());
//            }
//        }
//        session.close();


////many to many
//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();
//        Employee employee3 = new Employee();
//        Projects projects1 = new Projects();
//        Projects projects2 = new Projects();
//        Projects projects3 = new Projects();
//        employee1.setEmployeeId(1);
//        employee1.setEmployeeName("Aditya");
//        employee2.setEmployeeId(2);
//        employee2.setEmployeeName("anuj");
//        employee3.setEmployeeId(3);
//        employee3.setEmployeeName("devansh");
//        projects1.setProjectId(11);
//        projects1.setProjectName("springboot");
//        projects2.setProjectId(22);
//        projects2.setProjectName("hibernate");
//        projects3.setProjectId(33);
//        projects3.setProjectName("spring");
//        List<Employee> employees1 = new ArrayList<>();
//        List<Employee> employees2 = new ArrayList<>();
//        List<Projects> projectsList1 = new ArrayList<>();
//        List<Projects> projectsList2 = new ArrayList<>();
//        employees1.add(employee1);
//        employees1.add(employee2);
//        employees2.add(employee1);
//        employees2.add(employee3);
//        projectsList1.add(projects1);
//        projectsList1.add(projects2);
//        projectsList1.add(projects3);
//        employee1.setProjects(projectsList1);
//        employee2.setProjects(projectsList2);
//        employee3.setProjects(projectsList2);
//        projects1.setEmployees(employees1);
//        projects2.setEmployees(employees2);
//        projects3.setEmployees(employees1);
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.save(employee1);
//        session.save(employee2);
//        session.save(employee3);
//        session.getTransaction().commit();
//        List<Employee> employeeList = session.createQuery("from Employee").list();
//        for(Employee e : employeeList){
//            System.out.println("emp id is : "+e.getEmployeeId());
//            System.out.println("emp name is : "+e.getEmployeeName());
//            List<Projects> projectsList = e.getProjects();
//            for(Projects p : projectsList){
//                System.out.println("project id is : "+p.getProjectId());
//                System.out.println("project name is : "+p.getProjectName());
//            }
//        }
//        session.close();
    }
}
