package Java_Basics.FirstStepsInCoding.TrapezoidArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = (b1 + b2) * h / 2;
        System.out.printf("%.2f", area);
    }
}
