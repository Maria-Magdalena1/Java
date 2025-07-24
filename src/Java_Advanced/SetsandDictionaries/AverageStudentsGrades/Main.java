package Java_Advanced.SetsandDictionaries.AverageStudentsGrades;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String ,List<Double>> students=new TreeMap<>();
        for (int i=0;i<n;i++) {
            String[] student=scanner.nextLine().split(" ");
            String studentName=student[0];
            Double grade=Double.parseDouble(student[1]);
            if (!students.containsKey(studentName)) {
                students.put(studentName,new ArrayList<>());
                students.get(studentName).add(grade);
            } else {
                students.get(studentName).add(grade);
            }
        }

        for (Map.Entry<String,List<Double>> entry:students.entrySet()) {
           String name=entry.getKey();
           List<Double> grades=entry.getValue();
            System.out.print(name+"-> ");
            double sum=0;
            for (double grade:grades) {
                System.out.printf("%.2f ",grade);
                sum+=grade;
            }
            double average=sum/grades.size();
            System.out.printf("(avg: %.2f)%n",average);
        }
        //students.forEach((name,grades)->{
        //    String gradesStr=grades.stream()
        //            .map(g->String.format("%.2f",g))
        //            .collect(Collectors.joining(" "));
        //
        //    double average=grades.stream()
        //            .mapToDouble(Double::doubleValue)
        //            .average()
        //            .orElse(0);
        //    System.out.printf("%s -> %s (avg: %.2f)%n",name,gradesStr,average);
        //});
    }
}
