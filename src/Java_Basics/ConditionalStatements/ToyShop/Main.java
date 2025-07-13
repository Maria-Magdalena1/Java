package Java_Basics.ConditionalStatements.ToyShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int count = puzzles + dolls + bears + minions + trucks;

        double sum = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        if (count >= 50) {
            sum -= sum * 0.25;
        }
        double totalsum = sum - sum * 0.10;
        double abs = Math.abs(totalsum - priceTrip);
        if (totalsum >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", abs);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", abs);
        }
    }
}
