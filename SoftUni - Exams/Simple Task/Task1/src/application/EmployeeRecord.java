package application;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRecord {

    private int id;
    private String name;
    private Integer managerId;
    private List<EmployeeRecord> managerEmployees;

    EmployeeRecord(int id, String name, Integer managerId) {
        this.id = id;
        this.name = name;
        this.managerId = managerId;
        this.managerEmployees = new ArrayList<>();
    }

    int getId() {
        return id;
    }

    private String getName() {
        return name;
    }

    Integer getManagerId() {
        return managerId;
    }

    List<EmployeeRecord> getManagerEmployees() {
        return managerEmployees;
    }

    private String singleEmployeeToString(EmployeeRecord employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("{id: ").append(employee.getId()).append(", name: ").append(employee.getName())
                .append(", managerId: ").append(employee.getManagerId()).append("}, ");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if(this.getManagerEmployees().size() > 0) {
            sb.append("{id: ").append(this.id).append(", name: ").append(this.name)
            .append(", managerId: ").append(this.managerId).append(", employees: [");
            this.getManagerEmployees().forEach(employeeRecord -> sb.append(employeeRecord.singleEmployeeToString(employeeRecord)));
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.append("]}");
        } else {
            return this.singleEmployeeToString(this).substring(0, this.singleEmployeeToString(this).length() - 2);
        }
        return sb.toString();
    }
}
