package day18_serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    int eid;
    String ename;
    float esal ;

    public Employee(int eid, String ename, float esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }
}
