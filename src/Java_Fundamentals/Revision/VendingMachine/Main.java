package Java_Fundamentals.Revision.VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.equals("Nuts")) {
                sum -= 2;
                if (sum < 0) {
                    System.out.println("Sorry, not enough money");
                    sum += 2;
                } else {
                    System.out.println("Purchased Nuts");
                }
            } else if (command.equals("Water")) {
                sum -= 0.7;
                if (sum < 0) {
                    System.out.println("Sorry, not enough money");
                    sum += 0.7;
                } else {
                    System.out.println("Purchased Water");
                }
            } else if (command.equals("Crisps")) {
                sum -= 1.5;
                if (sum < 0) {
                    System.out.println("Sorry, not enough money");
                    sum += 1.5;
                } else {
                    System.out.println("Purchased Crisps");
                }
            } else if (command.equals("Soda")) {
                sum -= 0.8;
                if (sum < 0) {
                    System.out.println("Sorry, not enough money");
                    sum += 0.8;
                } else {
                    System.out.println("Purchased Soda");
                }
            } else if (command.equals("Coke")) {
                sum -= 1.0;
                if (sum < 0) {
                    System.out.println("Sorry, not enough money");
                    sum += 1.0;
                } else {
                    System.out.println("Purchased Coke");
                }
            } else {
                System.out.println("Invalid product");
            }

            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
