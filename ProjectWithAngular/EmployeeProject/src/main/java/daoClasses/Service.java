package daoClasses;

import java.util.HashMap;
import java.util.List;

public interface Service {
      HashMap<Integer,String> getAllEmployeeIdAndName();
      Employee getParticularEmployeeDetails(int id);
}
