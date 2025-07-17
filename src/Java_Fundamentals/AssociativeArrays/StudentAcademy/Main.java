package Java_Fundamentals.AssociativeArrays.StudentAcademy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students=new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name=scanner.nextLine();
            Double grade=Double.parseDouble(scanner.nextLine());
            if (students.containsKey(name)) {
                students.get(name).add(grade);
            } else {
                students.put(name,new ArrayList<>());
                students.get(name).add(grade);
            }
        }

        Map<String,Double> studentAverageGrade=new LinkedHashMap<>();
        for (Map.Entry<String,List<Double>> entry :students.entrySet()) {
            String studentName=entry.getKey();
            List<Double> grades=entry.getValue();
            double average=grades.stream().mapToDouble(d->d).average().orElse(0.0);
            if(average>=4.50) {
                studentAverageGrade.put(studentName,average);
            }
        }

        studentAverageGrade.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
}
