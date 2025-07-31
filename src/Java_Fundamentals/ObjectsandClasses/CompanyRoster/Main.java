package Java_Fundamentals.ObjectsandClasses.CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Department> departments=new HashMap<>();
        for (int i=0;i<n;i++) {
            String [] input=scanner.nextLine().split("\\s+");
            String name=input[0];
            double salary= Double.parseDouble(input[1]);
            String position=input[2];
            String department=input[3];
            Employee employee;
            if (input.length==4) {
                employee=new Employee(name,salary,position,department);
            } else if (input.length==5) {
                if (input[4].contains("@")) {
                    employee=new Employee(name,salary,position,department,input[4]);
                } else {
                    employee=new Employee(name,salary,position,department,Integer.parseInt(input[4]));
                }
            } else {
                String email =input[4];
                int age= Integer.parseInt(input[5]);
                employee=new Employee(name,salary,position,department, email,age);
            }

            departments.putIfAbsent(department,new Department(department));
            departments.get(department).AddEmployee(employee);
        }

        Department highestPaidDepartment=departments.values().stream()
                .max(Comparator.comparingDouble(Department::getAverageSalary))
                .orElse(null);

        if (highestPaidDepartment!=null) {
            System.out.println("Highest Average Salary: " + highestPaidDepartment.getName());
            highestPaidDepartment.getEmployees().stream()
                    .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                    .forEach(e-> System.out.printf("%s %.2f %s %d%n",
                            e.getName(),
                            e.getSalary(),
                            e.getEmail(),
                            e.getAge()));
        }
    }
}
