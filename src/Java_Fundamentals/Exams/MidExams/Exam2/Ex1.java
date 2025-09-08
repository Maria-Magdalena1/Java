package Java_Fundamentals.Exams.MidExams.Exam2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPerHour = 0;
        for (int i = 1; i <= 3; i++) {
            int employeeEfficiency = Integer.parseInt(scanner.nextLine());
            totalPerHour += employeeEfficiency;
        }
        int students = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        while (students > 0) {
            hours++;
            if (hours%4==0) {
                continue;
            }
            students-=totalPerHour;
        }
        System.out.printf("Time needed: %dh.%n", hours);
    }
}
