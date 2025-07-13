package Java_Basics.FirstStepsInCoding.FishLand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceSprat = Double.parseDouble(scanner.nextLine());
        double kgBonito = Double.parseDouble(scanner.nextLine());
        double kgScad = Double.parseDouble(scanner.nextLine());
        int kgMussels = Integer.parseInt(scanner.nextLine());

        double priceBonito = priceMackerel + priceMackerel * 0.60;
        double totalBonito = priceBonito * kgBonito;

        double priceScad = priceSprat + priceSprat * 0.80;
        double totalScad = priceScad * kgScad;

        double totalMussels = kgMussels * 7.50;

        double totalSum = totalBonito + totalScad + totalMussels;
        System.out.printf("%.2f", totalSum);
    }
}
