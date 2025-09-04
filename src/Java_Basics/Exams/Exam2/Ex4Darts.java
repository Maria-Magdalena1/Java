package Java_Basics.Exams.Exam2;

import java.util.Scanner;

public class Ex4Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int totalPoints = 301;
        String field = scanner.nextLine();
        int successfulShots = 0;
        int unsuccessfulShots = 0;
        while (!field.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            switch (field) {
                case "Single":
                    if (totalPoints >= points) {
                        totalPoints -= points;
                        successfulShots++;
                    } else {
                        unsuccessfulShots++;
                    }
                    break;
                case "Double":
                    if (totalPoints >= 2 * points) {
                        totalPoints -= 2 * points;
                        successfulShots++;
                    } else {
                        unsuccessfulShots++;
                    }
                    break;
                case "Triple":
                    if (totalPoints >= 3 * points) {
                        totalPoints -= 3 * points;
                        successfulShots++;
                    } else {
                        unsuccessfulShots++;
                    }
                    break;
            }

            if (totalPoints==0) {
                System.out.printf("%s won the leg with %d shots.",name,successfulShots);
                return;
            }
            field = scanner.nextLine();
        }

        System.out.printf("%s retired after %d unsuccessful shots.",name,unsuccessfulShots);
    }
}
