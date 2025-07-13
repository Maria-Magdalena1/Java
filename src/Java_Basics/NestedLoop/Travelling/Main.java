package Java_Basics.NestedLoop.Travelling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double excursionPrice = Double.parseDouble(scanner.nextLine());
            double availableMoney = 0;
            while (availableMoney < excursionPrice) {
                double saveMoney = Double.parseDouble(scanner.nextLine());
                availableMoney += saveMoney;

            }
            System.out.printf("Going to %s!%n", input);

            input = scanner.nextLine();
        }
    }
}
