package Java_Basics.Exams.Exam9;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        int countProducts = 0;
        double totalPrice = 0;
        String productName = scanner.nextLine();
        while (!productName.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            countProducts++;
            if (countProducts % 3 == 0) {
                price -= price * 0.50;
            }
            if (budget >= price) {
                budget -= price;
                totalPrice += price;
            } else {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", price - budget);
                return;
            }
            productName = scanner.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.", countProducts, totalPrice);
    }
}
