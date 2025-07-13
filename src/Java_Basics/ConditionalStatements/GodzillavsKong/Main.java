package Java_Basics.ConditionalStatements.GodzillavsKong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        if (actors > 150) {
            clothesPrice -= clothesPrice * 0.10;
        }

        double total = decor + actors * clothesPrice;
        double diff = Math.abs(total - budget);
        if (budget >= total) {
            System.out.println("Action");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
