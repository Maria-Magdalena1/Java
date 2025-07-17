package Java_Fundamentals.AssociativeArrays.SoftUniExamResults;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> students = new LinkedHashMap<>();//ime tochki
        Map<String, Integer> courses = new LinkedHashMap<>();//kurs broi
        while (!input.equals("exam finished")) {
            if (input.contains("banned")) {
                String username = input.split("-")[0];
                students.remove(username);
            } else {
                String studentsName = input.split("-")[0];
                String courseName = input.split("-")[1];
                Integer studentsPoints = Integer.parseInt(input.split("-")[2]);

                //if we do not have student with this name
                if (!students.containsKey(studentsName)) {
                    students.put(studentsName, studentsPoints);
                } else {
                    //if we have student with this name
                    int currentPoints = students.get(studentsName);
                    if (studentsPoints > currentPoints) {
                        students.put(studentsName, studentsPoints);
                    }
                }

                //if we don't have this course
                if (!courses.containsKey(courseName)) {
                    courses.put(courseName, 1);
                } else {
                    //if we have
                    int currentCount = courses.get(courseName);
                    courses.put(courseName, currentCount + 1);
                }
            }
                input = scanner.nextLine();
        }

        System.out.println("Results:");
        students.entrySet().forEach(entry-> System.out.println(entry.getKey()+" | "+entry.getValue()));
        System.out.println("Submissions:");
        courses.entrySet().forEach(entry-> System.out.println(entry.getKey()+" - "+entry.getValue()));
    }
}
