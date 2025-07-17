package Java_Fundamentals.AssociativeArrays.CompanyUsers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> employees = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];
            //ako ima kompaniq
            if (employees.containsKey(companyName)) {
                List<String> currentEmployees=employees.get(companyName);
                if(!currentEmployees.contains(employeeId)) {
                    currentEmployees.add(employeeId);
                }

            }

            //nqma kompaniq
            else {
                employees.put(companyName,new ArrayList<>());
                employees.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }

        employees.entrySet().forEach(entry->{
            String companyName=entry.getKey();
            List<String> employeesList=entry.getValue();
            System.out.println(companyName);
            for (String employee:employeesList) {
                System.out.println("-- "+employee);
            }
        });
    }
}
