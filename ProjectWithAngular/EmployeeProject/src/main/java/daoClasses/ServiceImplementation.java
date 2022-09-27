package daoClasses;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service {
    OperationsWithDataBase operationsWithDataBase = new OperationsWithDatabaseImplementation();

    @Override
    public HashMap<Integer,String> getAllEmployeeIdAndName() {
        HashMap<Integer,String> employeeIdNameList = operationsWithDataBase.fetchUserIdAndName();
        return employeeIdNameList;
    }

    @Override
    public Employee getParticularEmployeeDetails(int id) {

        Employee employee = operationsWithDataBase.fetchParticularUserDetails(id);
        return employee;
    }
}
