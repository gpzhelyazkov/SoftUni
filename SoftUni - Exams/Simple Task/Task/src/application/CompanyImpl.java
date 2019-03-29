package application;

import application.interfaces.Company;
import java.util.ArrayList;
import java.util.List;

public class CompanyImpl implements Company {

    private List<EmployeeRecord> employees;

    CompanyImpl() {
        this.employees = new ArrayList<>();
    }

    private void setEmployees(List<EmployeeRecord> employees) {
        this.employees = employees;
    }

    @Override
    public EmployeeRecord buildHierarchy(List<EmployeeRecord> employees) {
        setEmployees(employees);

        int managersCount = 0;
        for (EmployeeRecord employee : employees) {
            if (employee.getManagerId() == null) managersCount++;
        }

        if(managersCount > 1) {
            throw new IllegalArgumentException("Only one manager allowed!");
        }

        EmployeeRecord manager = employees.stream()
                .filter(employeeRecord -> employeeRecord.getManagerId() == null)
                        .findFirst().orElse(null);

        for (EmployeeRecord employee : employees) {
            assert manager != null;
            if (employee.getManagerId() != null && employee.getManagerId() == manager.getId()) {
                manager.getManagerEmployees().add(employee);
            }
        }

        return manager;
    }
}
