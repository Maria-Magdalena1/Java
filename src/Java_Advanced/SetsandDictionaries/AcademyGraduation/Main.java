package Java_Advanced.SetsandDictionaries.AcademyGraduation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfStudents=Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>> graduationList=new TreeMap<>();
        for (int i=0;i<numberOfStudents;i++) {
            String name=scanner.nextLine();
            double [] grades= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            List<Double> gr=new ArrayList<>();
            for (double grade:grades) {
                gr.add(grade);
            }
            //String[] scores=scanner.next().split(" ");
            //Double [] score=new Double[scores.length];
            //for (int j=0;j<scores.length;j++) {
            //    score[j]=Double.parseDouble(scores[j]);
            //}
            graduationList.put(name,gr);
        }

        graduationList.forEach((k,v)->{
            double average=v.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0);
            System.out.printf("%s is graduated with %f%n",k,average);
        });
    }
}
