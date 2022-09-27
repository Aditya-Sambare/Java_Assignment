package daoClasses;

import java.util.HashMap;
import java.util.List;

public interface OperationsWithDataBase {
    HashMap<Integer,String> fetchUserIdAndName();
    Employee fetchParticularUserDetails(int id);
}
