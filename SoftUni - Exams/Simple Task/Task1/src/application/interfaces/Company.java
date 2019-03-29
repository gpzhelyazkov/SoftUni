package application.interfaces;

import application.EmployeeRecord;
import java.util.List;

public interface Company {

    EmployeeRecord buildHierarchy(List<EmployeeRecord> employees);
}
