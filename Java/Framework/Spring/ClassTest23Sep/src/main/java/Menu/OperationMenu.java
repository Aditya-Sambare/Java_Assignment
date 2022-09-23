package Menu;

import Dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationMenu {
    public void displaymenu() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("edao");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean entry = true;
        while(entry){
            System.out.println("=======================================================================");
            System.out.println("Enter 1 to insert Record\nEnter 2 to fetch Records\nEnter 3 to update Record\nEnter 4 to delete Record\nEnter 5 to Sort by last name\nEnter 6 to fetch record having salary more than 10000 and fro city mumbai\nEnter 7 to Exit");
            System.out.println("=======================================================================");
            int option = Integer.parseInt(bufferedReader.readLine());
            switch (option){
                case 1://insert record
employeeDao.insertrecord();
                    break;
                case 2://fetch records
                    employeeDao.fetchrecords();
                    break;
                case 3://update records
                    employeeDao.update();
                    break;
                case 4://delete record
                    employeeDao.delete();
                    break;
                case 5://sort by lastname
                    employeeDao.sortbylastname();
                    break;
                case 6://fetch record having salary more than 10000 and fro city mumbai
                    employeeDao.fetchbysalaryandcity();
                    break;
                case 7://exit
                    entry = false;
                    break;
            }
        }

    }
}
