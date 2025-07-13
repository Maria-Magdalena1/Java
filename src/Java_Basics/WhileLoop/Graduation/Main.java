package Java_Basics.WhileLoop.Graduation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int year = 1;
        double sum = 0;
        int poor = 0;
        while (year <= 12) {
            if (poor > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                poor++;
                continue;
            }
            sum += grade;
            year++;
        }
        if (poor > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
