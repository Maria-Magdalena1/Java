package Java_Fundamentals.ObjectsandClasses.Students;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            Student student = new Student(firstName, lastName, age, hometown);
            studentList.add(student);

            input = scanner.nextLine();
        }
        String searchedTown = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getHometown().equals(searchedTown)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }
}
