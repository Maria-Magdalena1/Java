package Java_Fundamentals.ObjectsandClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name=name;
        this.employees=new ArrayList<>();
    }

    public void AddEmployee(Employee employee) {
        employees.add(employee);
    }

    public double getAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}
