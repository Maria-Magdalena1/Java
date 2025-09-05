package Java_Basics.Exams.Exam7;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        while ((!name.equals("ACTION"))) {
            double salary = 0;
            if (name.length() <= 15) {
                salary = Double.parseDouble(scanner.nextLine());
            } else {
                salary =budget*0.20;
            }

            budget-=salary;
            if (budget<0) {
                break;
            }
            name = scanner.nextLine();
        }

        if (budget<0) {
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.",budget);
        }
    }
}
