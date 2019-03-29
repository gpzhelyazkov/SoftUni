package application;

import application.interfaces.Company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Files with the given data.
    private static final String EXAMPLE_DATA_FILE = "/application/resources/exampleData.csv";
    private static final String TWO_MANAGERS_FILE = "/application/resources/twoManagers.csv";
    private static final String TEST_FILE = "/application/resources/test.csv";

    public static void main(String[] args) throws IOException {

        //Creating companies.
        Company exampleCompany = new CompanyImpl();
        Company twoManCompany = new CompanyImpl();
        Company testCompany = new CompanyImpl();

        /*Build first company hierarchy.
        *Create employees list, fill company list with employees, check for the manager, print the hierarchy.
         */
        List<EmployeeRecord> exampleEmployees = parseData(EXAMPLE_DATA_FILE);
        EmployeeRecord exampleManager = exampleCompany.buildHierarchy(exampleEmployees);
        System.out.println(exampleManager.toString());

        //Build second company hierarchy. Two managers.
        try {
            List<EmployeeRecord> twoManEmployees = parseData(TWO_MANAGERS_FILE);
            EmployeeRecord twoManagers = twoManCompany.buildHierarchy(twoManEmployees);
            System.out.println(twoManagers.toString());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        //Build third company hierarchy.
        List<EmployeeRecord> testEmployees = parseData(TEST_FILE);
        EmployeeRecord testManager = testCompany.buildHierarchy(testEmployees);
        System.out.println(testManager.toString());

    }

    private static List<EmployeeRecord> parseData(String filePath) throws IOException {
        List<EmployeeRecord> employees = new ArrayList<>();

        try(
                InputStream inputStream = Main.class.getResourceAsStream(filePath);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeeData = line.split(";");
                if (!employeeData[2].equals("null")) {
                    employees.add(new EmployeeRecord(Integer.parseInt(employeeData[0]), employeeData[1], Integer.valueOf(employeeData[2])));
                } else {
                    employees.add(new EmployeeRecord(Integer.parseInt(employeeData[0]), employeeData[1],null));
                }
            }
        }
        return employees;
    }
}
