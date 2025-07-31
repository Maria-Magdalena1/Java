package Java_Fundamentals.ObjectsandClasses.StudentsAndGrades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        List<Student> students=new ArrayList<>();
        for (int i=0;i<n;i++) {
            String [] information=scanner.nextLine().split(" ");
            String firstName=information[0];
            String lastName=information[1];
            double grade=Double.parseDouble(information[2]);

            Student student=new Student(firstName,lastName,grade);
            students.add(student);
        }
        students.sort((s1,s2)->Double.compare(s2.getGrade(),s1.getGrade()));

        for (Student student:students) {
            System.out.println(student);
        }
    }
}
