package Java_Fundamentals.Exams.MidExams.Exam5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lecturers = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        int maxAttendance=0;
        double maxBonus=0;
        for (int i = 1; i <= students; i++) {
            int attendance=Integer.parseInt(scanner.nextLine());
            double totalBonus=(attendance*1.0/lecturers)*(5+additionalBonus);

            if (totalBonus>maxBonus) {
                maxBonus=totalBonus;
                maxAttendance=attendance;
            }
        }
        System.out.printf("Max Bonus: %d.%n", (int) Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.%n", maxAttendance);
    }
}
